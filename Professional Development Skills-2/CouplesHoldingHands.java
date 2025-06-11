public class CouplesHoldingHands{
public static int minSwapsCouples(int row[]){
int swaps=0;
for(int i=0;i<row.length;i+=2){
int firstPerson=row[i];
int expectedPartner=(firstPerson%2==0)?firstPerson+1:firstPerson-1;
if(row[i+1]!=expectedPartner){
swaps++;
for(int j=i+1;j<row.length;j++){
if(row[j]==expectedPartner){
int temp=row[j];
row[j]=row[i+1];
row[i+1]=temp;
break;
}
}
}
}
return swaps;
}

public static void main(String args[]){
int arr[]={3,1,4,0,2,5};
int result=minSwapsCouples(arr);
System.out.println("Minimum swaps needed: "+result);
}
}