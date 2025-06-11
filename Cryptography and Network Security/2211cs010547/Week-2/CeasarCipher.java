
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class CeasarCipher {
    static Scanner sc = new Scanner(System.in);
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        System.out.println("Enter any string: ");
        String str=br.readLine();
        System.out.println("Enter the key: ");
        int key=sc.nextInt();
        String encrpted = encrpyt(str,key);
        System.out.println("\nEncrypted String is: "+encrpted);
        System.out.println();
        String decrpted = decrpyt(encrpted,key);
        System.out.println("Decrypted String is: "+decrpted);
        System.out.println("\n");
    }
    public static String encrpyt(String str,int key){
        String encrypted="";
        for(int i=0;i<str.length();i++){
            int c=str.charAt(i);
            if (Character.isUpperCase(c)) {
                c = c + (key % 26);
                if (c > 'Z')
                    c = c - 26;
            } else if (Character.isLowerCase(c)) {
                c = c + (key % 26);
                if (c > 'z')
                    c = c - 26;
            }
            encrypted+=(char) c;
        }
        return encrypted;
    }
    public static String decrpyt(String str,int key){
        String decrypted="";
        for(int i=0;i<str.length();i++){
            int c=str.charAt(i);
            if (Character.isUpperCase(c)) {
                c = c - (key % 26);
                if (c < 'A')
                    c = c + 26;
            } else if (Character.isLowerCase(c)) {
                c = c - (key % 26);
                if (c < 'a')
                    c = c + 26;
            }
            decrypted+=(char) c;
        }
        return decrypted;
    }
}
