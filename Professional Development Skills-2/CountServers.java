public class CountServers{
public static int countServers(int[][] grid){
int m=grid.length;
int n=grid[0].length;
int[] rowCounts=new int[m];
int[] colCounts=new int[n];
for (int i=0;i<m;i++){
for (int j=0;j<n;j++){
if (grid[i][j]==1){
rowCounts[i]++;
colCounts[j]++;
}
}
}
int count=0;
for (int i=0;i<m;i++){
for (int j=0;j<n;j++){
if (grid[i][j] == 1 && (rowCounts[i]>1 || colCounts[j]>1)){
count++;
}
}
}
return count;
}
public static void main(String[] args){
int[][] grid={
{1,0,0},
{0,1,1},
{1,0,1}
};
int result=countServers(grid);
System.out.println("Number of servers that communicate: "+result);
}
}