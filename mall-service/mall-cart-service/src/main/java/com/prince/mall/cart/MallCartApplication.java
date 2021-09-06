package com.prince.mall.cart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Project mall <br\>
 * Package com.prince.mall.cart <br\>
 * <p>
 * Description :  <br\>
 *
 * @author StrangePrince <br\>
 * @since 2021/9/6 23:03
 */
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@EnableFeignClients("com.prince.mall.goods.feign")
public class MallCartApplication {
    public static void main(String[] args) {
        SpringApplication.run(MallCartApplication.class, args);
    }
}
