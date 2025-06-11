public with sharing class InventoryController {
    @AuraEnabled(cacheable=true)
    public static List<product__c> getLowStockProducts() {
        Integer threshold = 10;
        if (!Schema.sObjectType.product__c.isAccessible()) {
            throw new AuraHandledException('Insufficient permissions to view products.');
        }
        return [
            SELECT Id, Name, Stock_Quantity__c 
            FROM product__c 
            WHERE Stock_Quantity__c < :threshold
        ];
    }

    @AuraEnabled
    public static void updateInventory(Id productId, Integer quantity) {
        if (!Schema.sObjectType.Inventory__c.isUpdateable()) {
            throw new AuraHandledException('Insufficient permissions to update inventory.');
        }
        Inventory__c inventory = [SELECT Id, Stock_Quantity__c FROM Inventory__c WHERE Product__c = :productId LIMIT 1];
        inventory.Stock_Quantity__c += quantity;
        update inventory;
    }
}
