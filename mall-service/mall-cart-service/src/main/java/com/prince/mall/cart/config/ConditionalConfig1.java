package com.prince.mall.cart.config;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * Project mall <br\>
 * Package com.prince.mall.cart.config <br\>
 * <p>
 * Description : 自动注入条件 <br\>
 *
 * @author StrangePrince <br\>
 * @since 2021/10/26 20:04
 */
public class ConditionalConfig1 implements Condition {
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        return "false".equals(context.getEnvironment().getProperty("condition"));
    }
}
