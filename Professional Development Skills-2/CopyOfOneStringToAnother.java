public class CopyOfOneStringToAnother {
    public static void main(String[] args) {
        String str1="Hello";
        String str2="";
        int len1=0;
        char[] c1=str1.toCharArray();
        for(int i=0;i<c1.length;i++) {
            len1++;
        }
        char[] result=new char[len1];
        for(int i=0;i<len1;i++) {
            result[i]=c1[i];
        }
        str2=new String(result);
        System.out.println("Copied string is: "+str2);
    }
}
