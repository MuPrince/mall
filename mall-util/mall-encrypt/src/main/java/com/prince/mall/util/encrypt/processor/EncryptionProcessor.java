package com.prince.mall.util.encrypt.processor;

/**
 * <b>Project :</b> project <br\>
 * <b>Package :</b> com.prince.mall.com.prince.mall.util.encrypt <br\>
 * <br\>
 * <b>Description :</b> 字符串加密 <br\>
 * <br\>
 *
 * @author Mu Prince <br\>
 * @since 2021/8/18 17:49
 */
public interface EncryptionProcessor {
    String encode(String secretKey, String text);

//    String encode(String content);

    String decode(String secretKey, String text);

//    String decode(String content);
}
