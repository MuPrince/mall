package com.prince.mall.util.encrypt.processor;

import com.prince.mall.util.Constants;
import com.prince.mall.util.encrypt.Base64;

import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESedeKeySpec;
import javax.crypto.spec.IvParameterSpec;
import java.security.Key;

/**
 * Created by 0opslab
 */
class DESEncryptionProcessor implements EncryptionProcessor {

    // 向量
    private final static String iv = "01234567";


    /**
     * 3DES加密
     *
     * @param plainText 普通文本
     * @return
     * @throws Exception
     */
    public static String encrypt(String secretKey, String plainText) {
        Key desKey = null;
        try {
            DESedeKeySpec spec = new DESedeKeySpec(secretKey.getBytes());
            SecretKeyFactory keyFactory = SecretKeyFactory.getInstance("desede");
            desKey = keyFactory.generateSecret(spec);

            Cipher cipher = Cipher.getInstance("desede/CBC/PKCS5Padding");// 算法/模式/补码方式
            IvParameterSpec ips = new IvParameterSpec(iv.getBytes());
            cipher.init(Cipher.ENCRYPT_MODE, desKey, ips);
            byte[] encryptData = cipher.doFinal(plainText.getBytes(Constants.UTF_8));
            return Base64.encodeToString(encryptData);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public String encode(String secretKey, String text) {
        return encrypt(secretKey, text);
    }

    /**
     * 3DES解密
     *
     * @param encryptText 加密文本
     * @return
     * @throws Exception
     */
    @Override
    public String decode(String secretKey, String encryptText) {
        Key deskey = null;
        try {
            DESedeKeySpec spec = new DESedeKeySpec(secretKey.getBytes());
            SecretKeyFactory keyfactory = SecretKeyFactory.getInstance("desede");
            deskey = keyfactory.generateSecret(spec);
            Cipher cipher = Cipher.getInstance("desede/CBC/PKCS5Padding");
            IvParameterSpec ips = new IvParameterSpec(iv.getBytes());
            cipher.init(Cipher.DECRYPT_MODE, deskey, ips);
            byte[] decryptData = cipher.doFinal(Base64.decode(encryptText));
            return new String(decryptData, Constants.UTF_8);
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }


}
