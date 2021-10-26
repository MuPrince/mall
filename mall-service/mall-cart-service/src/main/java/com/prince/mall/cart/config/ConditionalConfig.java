package com.prince.mall.cart.config;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.context.annotation.Conditional;
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
public class ConditionalConfig implements Condition {
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        String condition = context.getEnvironment().getProperty("condition");
        return "true".equals(condition);
    }
}
