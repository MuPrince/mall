package com.prince.mall.canal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Project mall <br\>
 * Package com.prince.mall.canal.listener <br\>
 * <p>
 * Description :  <br\>
 *
 * @author StrangePrince <br\>
 * @since 2021/8/31 20:21
 */
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@EnableFeignClients(basePackages = {"com.prince.mall.goods.feign"})
public class MallCanalApplication {

    public static void main(String[] args) {
        SpringApplication.run(MallCanalApplication.class,args);
    }
}
