package com.association;

import javax.crypto.*;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

public class AES {
    private SecretKey key;
    private  int KEY_SIZE = 128;
    public void init(){
        try {
            KeyGenerator generator = KeyGenerator.getInstance("AES");
            generator.init(KEY_SIZE);
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    public String encryptPass(String pass){
        byte[] passInBytes = pass.getBytes();
        try {
            Cipher encryptionCipher = Cipher.getInstance("AES/GCM/NoPadding");
            encryptionCipher.init(Cipher.ENCRYPT_MODE,key);

            byte[] encryptedBytes = encryptionCipher.doFinal(passInBytes);
            return  encode(encryptedBytes);
        }
        catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    private String encode(byte[] data){
        return  Base64.getEncoder().encodeToString(data);
    }
    private byte[] decode(String data){
        return Base64.getDecoder().decode(data);
    }

    public String decryptPass(String encryptedPass){
        byte[] passInBytes = decode(encryptedPass);

        return "";


    }

}
