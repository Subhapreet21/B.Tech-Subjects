public class StringLength{
    public static void main(String[] args) {
        String str="Hello";
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
    }
}