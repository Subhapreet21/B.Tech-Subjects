public class ReversingString {
    public static void main(String[] args) {
        String str="Hello";
        String rev="";
        int len=0;
        try {
            while (true) { 
                str.charAt(len);
                len++;
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Exception: "+e);
        }
        System.out.println("Length of the string is: "+len);
        for (int i=len-1; i>=0; i--) {
            rev+=str.charAt(i);
        }
        System.out.println("Reversed string is: "+rev);
    }
}
