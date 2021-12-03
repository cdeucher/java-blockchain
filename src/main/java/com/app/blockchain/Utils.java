package com.app.blockchain;

import java.security.MessageDigest;

public class Utils {
    public static String applySha256(String toString) {
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            byte[] hash = digest.digest(toString.getBytes("UTF-8"));
            StringBuffer hexString = new StringBuffer();
            String hex = null;
            for (int i = 0; i < hash.length; i++) {
                hex = Integer.toHexString(0xff & hash[i]);
                if (hex.length() == 1)
                    hexString.append('0');
                hexString.append(hex);
            }
            return hexString.toString();
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }
}
