package com.association;

import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.InvalidKeySpecException;
import java.util.Arrays;
import java.util.Base64;
import java.util.Optional;

public class SecurePassword {
    private static final int ITERATIONS = 65536;
    private static final int KEY_LENGTH = 512;
    private static final String ALGORITHM = "PBKDF2WithHmacSHA512";

    SecurePassword(){

    }

    /**
     * Generate salt for computing hash from password
     * @param length the length for the salt
     * @return the generated salt
     */
    public static Optional<String> generateSalt (final int length) {
        final SecureRandom RAND;
        try {
            RAND = SecureRandom.getInstanceStrong();
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
        if (length < 1) {
//            System.err.println("error in generateSalt: length must be > 0");
            return Optional.empty();
        }

        byte[] salt = new byte[length];
        RAND.nextBytes(salt);

        return Optional.of(Base64.getEncoder().encodeToString(salt));
    }

    /**
     * Generate hash from input password
     * @param password the password given by user
     * @param salt used to generate hash
     * @return the hash generated from password using salt
     */
    public static Optional<String> hashPassword (String password, String salt) {

        char[] chars = password.toCharArray();
        byte[] bytes = salt.getBytes();

        PBEKeySpec spec = new PBEKeySpec(chars, bytes, ITERATIONS, KEY_LENGTH);

        Arrays.fill(chars, Character.MIN_VALUE);

        try {
            SecretKeyFactory fac = SecretKeyFactory.getInstance(ALGORITHM);
            byte[] securePassword = fac.generateSecret(spec).getEncoded();
            return Optional.of(Base64.getEncoder().encodeToString(securePassword));

        } catch (NoSuchAlgorithmException | InvalidKeySpecException ex) {
//            System.err.println("Exception encountered in hashPassword()");
            return Optional.empty();

        }
         finally {
            spec.clearPassword();
        }
    }

    /**
     * Verify password by genrating hash and comparing with the hash stored in DB
     * @param password the given password to verify
     * @param key the hash stored in DB
     * @param salt used to generate hash
     * @return whether verified or not
     */
    public static boolean verifyPassword (String password, String key, String salt) {
        Optional<String> optEncrypted = hashPassword(password, salt);
        if (!optEncrypted.isPresent()) return false;
        return optEncrypted.get().equals(key);
    }
}