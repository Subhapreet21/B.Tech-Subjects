public with sharing class OrderController {
    @AuraEnabled(cacheable=true)
    public static Id createOrder(Map<String, Object> orderData) {
        // Check if the user has permission to create an Order__c record
        if (!Schema.sObjectType.order__c.isCreateable()) {
            throw new AuraHandledException('Insufficient permissions to create an Order.');
        }
        order__c order = new order__c(
            Order_Date__c = (Date)orderData.get('orderDate'),
            Customer_Master_Detail__c = (Id)orderData.get('customerId') // Use the appropriate Customer field
        );
        insert order;
        return order.Id;
    }
    @AuraEnabled(cacheable=true)
    public static List<Map<String, Object>> getOrderSummary() {
        // Check if the user has read access on Order__c before querying
        if (!Schema.sObjectType.Order__c.isAccessible()) {
            throw new AuraHandledException('Insufficient permissions to read Orders.');
        }
        List<AggregateResult> results = [
            SELECT Status__c, COUNT(Id) cnt
            FROM order__c
            GROUP BY Status__c
        ];
        
        List<Map<String, Object>> summary = new List<Map<String, Object>>();
        for (AggregateResult ar : results) {
            Map<String, Object> statusMap = new Map<String, Object>{
                'status' => ar.get('Status__c'),
                'count' => ar.get('cnt')
            };
            summary.add(statusMap);
        }
        return summary;
    }
}
