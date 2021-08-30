package com.prince.mall.util;

/**
 * <b>Project :</b> project <br\>
 * <b>Package :</b> com.prince.mall.com.prince.mall.util <br\>
 * <br\>
 * <b>Description :</b> 公私钥管理 <br\>
 * <br\>
 *
 * @author Mu Prince <br\>
 * @since 2021/8/19 14:29
 */
public class EncryptKeyManager {

    private static ThreadLocal<String> keys = new ThreadLocal<>();

    public static String setKey(String key) {
        keys.set(key);
        return key;
    }

    public static String getKey() {
        String key = keys.get();
        return key;
    }
}
