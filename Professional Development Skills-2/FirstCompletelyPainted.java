public class FirstCompletelyPainted{
public static int firstCompleteIndex(int[] arr,int[][] mat){
int m=mat.length;
int n=mat[0].length;
int[] rowCount=new int[m];
int[] colCount=new int[n];
int[][] positions=new int[m*n+1][2];
for(int i=0;i<m;i++){
for (int j=0;j<n;j++){
positions[mat[i][j]]=new int[]{i,j};
}
}
for(int i=0;i<arr.length;i++){
int row=positions[arr[i]][0];
int col=positions[arr[i]][1];
rowCount[row]++;
colCount[col]++;
if (rowCount[row]==n || colCount[col]==m){
return i;
}
}
return -1;
}
public static void main(String[] args){
int[] arr={4,2,8,1,7,3,6,5,9};
int[][] mat={
{1,2,3},
{4,5,6},
{7,8,9}
};
int result=firstCompleteIndex(arr,mat);
System.out.println("The first completely painted row or column is at index: "+result);
}
}