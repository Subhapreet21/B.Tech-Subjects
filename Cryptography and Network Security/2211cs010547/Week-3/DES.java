
import java.security.SecureRandom;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import javax.swing.*;

public class DES {

    byte[] skey = new byte[1000];
    String skeystring;
    static byte[] raw;
    String inputmessage, encryptedata, decryptedmessage;

    public DES() {
        try {
            generatesymmetrickey();
            inputmessage = JOptionPane.showInputDialog(null, "Enter message to encrypt:");
            byte[] ibyte = inputmessage.getBytes();
            byte[] ebyte = encrypt(raw, ibyte);
            String encrypteddata = new String(ebyte);
            System.out.println("Encrypted message:" + encrypteddata);
            JOptionPane.showMessageDialog(null, "Encrypted Data" + "\n" + encrypteddata);
            byte[] dbyte = decrypt(raw, ebyte);
            String decryptedmessage = new String(dbyte);
            System.out.println("Decrypted message:" + decryptedmessage);
            JOptionPane.showMessageDialog(null, "Decrypted Data " + "\n" + decryptedmessage);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    void generatesymmetrickey() {
        try {
            Random r = new Random();
            int num = r.nextInt(10000);
            String knum = String.valueOf(num);
            byte[] knumb = knum.getBytes();
            skey = getRawKey(knumb);
            skeystring = new String(skey);
            System.out.println("DES SymmerticKey=" + skeystring);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    private static byte[] getRawKey(byte[] seed) throws Exception {
        KeyGenerator kgen = KeyGenerator.getInstance("DES");
        SecureRandom sr = SecureRandom.getInstance("SHA1PRNG");
        sr.setSeed(seed);
        kgen.init(56, sr);
        SecretKey skey = kgen.generateKey();
        raw = skey.getEncoded();
        return raw;
    }

    private static byte[] encrypt(byte[] raw, byte[] clear) throws Exception {
        SecretKey seckey = new SecretKeySpec(raw, "DES");
        Cipher cipher = Cipher.getInstance("DES");
        cipher.init(Cipher.ENCRYPT_MODE, seckey);
        byte[] encrypted = cipher.doFinal(clear);
        return encrypted;
    }

    private static byte[] decrypt(byte[] raw, byte[] encrypted) throws Exception {
        SecretKey seckey = new SecretKeySpec(raw, "DES");
        Cipher cipher = Cipher.getInstance("DES");
        cipher.init(Cipher.DECRYPT_MODE, seckey);
        byte[] decrypted = cipher.doFinal(encrypted);
        return decrypted;
    }

    public static void main(String args[]) {
        DES des = new DES();
    }
}
