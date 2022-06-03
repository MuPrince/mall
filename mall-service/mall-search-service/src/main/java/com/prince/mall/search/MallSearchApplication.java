package com.prince.mall.search;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;

/**
 * Project mall <br\>
 * Package com.prince.mall.search <br\>
 * <p>
 * Description :  <br\>
 *
 * @author StrangePrince <br\>
 * @since 2021/9/1 22:03
 */
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@EnableElasticsearchRepositories(basePackages = "com.prince.mall.search.mapper")
public class MallSearchApplication {

    public static void main(String[] args) {
        SpringApplication.run(MallSearchApplication.class,args);
    }
}
