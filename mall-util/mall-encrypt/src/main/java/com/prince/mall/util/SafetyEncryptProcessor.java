package com.prince.mall.util;

import com.prince.mall.util.encrypt.processor.ASEEncryptionProcessor;
import com.prince.mall.util.encrypt.processor.EncryptionProcessor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.env.EnvironmentPostProcessor;
import org.springframework.boot.env.OriginTrackedMapPropertySource;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.MapPropertySource;
import org.springframework.core.env.PropertySource;

import java.util.HashMap;

/**
 * <b>Project :</b> project <br\>
 * <b>Package :</b> com.prince.mall.com.prince.mall.util.encrypt <br\>
 * <br\>
 * <b>Description :</b>  <br\>
 * <br\>
 *
 * @author Mu Prince <br\>
 * @since 2021/8/18 15:29
 */
public class SafetyEncryptProcessor implements EnvironmentPostProcessor {

    @Override
    public void postProcessEnvironment(ConfigurableEnvironment environment, SpringApplication application) {

        HashMap<String, Object> map = new HashMap<>();
        for (PropertySource<?> ps : environment.getPropertySources()) {
            //获得所有配置信息
            if (ps instanceof OriginTrackedMapPropertySource) {
                OriginTrackedMapPropertySource source = (OriginTrackedMapPropertySource) ps;
                //读取加解密secretKey
                String key = (String) source.getProperty("encrypt.key");
                //读取需要解密的属性值前缀
                String prefix = (String) source.getProperty("encrypt.prefix");
                //处理加密属性前缀,前缀必须包含 "::"
                if (prefix == null || "null".equals(prefix)) {
                    prefix = "::";
                } else {
                    prefix += "::";
                }
                //获取加解密处理类，未配置则使用com.prince.mall.com.prince.mall.util.encrypt.ASEEncrypt
                String encryptClassName = (String) source.getProperty("encrypt.processor");
                if (encryptClassName == null || "null".equals(encryptClassName)) {
                    encryptClassName = "com.prince.mall.com.prince.mall.util.encrypt.processor.ASEEncryptionProcessor";
                }
                try {
                    Class<?> encrypt = Class.forName(encryptClassName);
                    EncryptionProcessor encryptionProcessor = (EncryptionProcessor) encrypt.newInstance();
                    for (String name : source.getPropertyNames()) {
                        Object value = source.getProperty(name);
                        System.out.println("value ======= " + value);
                        if (value instanceof String) {
                            String str = (String) value;
                            if (str.startsWith(prefix)) { //psw:  需要处理的value的前缀
                                // 解密value
                                str = str.substring(prefix.length());
                                str = encryptionProcessor.decode(key, str);
                                map.put(name, str);
                            }
                        }
                    }
                } catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
                    e.printStackTrace();
                }
            }
        }
        // 将处理的数据放入环境变量，并处于第一优先级上 (这里一定要注意，覆盖其他配置)
        if (!map.isEmpty()) {
            environment.getPropertySources().addFirst(new MapPropertySource("prefix", map));
        }
    }

    public static void main(String[] args) {
        String encrypt = new ASEEncryptionProcessor().encode("prince", "root");
        System.out.println(encrypt);

    }
}
