package hu.csekolms.sandbox;

import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;

public class Service {
    private static final int UNUSED_CONSTANT = -1;
    public void something() {
        int unused = 0;
    }
    public void tested(){
        System.out.println("tested()");
    }
    // Trying to trigger codeql violation https://codeql.github.com/codeql-query-help/java/java-static-initialization-vector/
    void staticIV() throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidAlgorithmParameterException, InvalidKeyException {
        byte[] iv = new byte[16]; // all zeroes
        GCMParameterSpec params = new GCMParameterSpec(128, iv);
        Cipher cipher = Cipher.getInstance("AES/GCM/PKCS5PADDING");
        Key key = new SecretKeySpec(iv, "AES");
        cipher.init(Cipher.ENCRYPT_MODE, key, params);
    }
}
