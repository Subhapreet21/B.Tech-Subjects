public class StringConcatenation {
    public static void main(String[] args) {
        String str1="Hello";
        String str2="World";
        int len1=0;
        int len2=0;
        char[] c1=str1.toCharArray();
        char[] c2=str2.toCharArray();
        for(int i=0;i<c1.length;i++) {
            len1++;
        }
        for(int i=0;i<c2.length;i++) {
            len2++;
        }
        char[] result=new char[len1+len2];
        for(int i=0;i<len1;i++) {
            result[i]=c1[i];
        }
        for(int j=0;j<len2;j++) {
            result[len1+j]=c2[j];
        }
        System.out.println("Concatenated string is: "+new String(result));
    }
}
