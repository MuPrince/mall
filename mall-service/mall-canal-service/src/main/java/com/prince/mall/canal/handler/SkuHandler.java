package com.prince.mall.canal.handler;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.prince.mall.goods.entity.Sku;
import com.prince.mall.search.entity.SkuEs;
import com.prince.mall.search.feign.SkuSearchFeign;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import top.javatool.canal.client.annotation.CanalTable;
import top.javatool.canal.client.handler.EntryHandler;

/**
 * Project mall <br\>
 * Package com.prince.mall.canal.handler <br\>
 * <p>
 * Description : Sku监听 <br\>
 *
 * @author StrangePrince <br\>
 * @since 2021/9/2 19:44
 */
@Component
@CanalTable("sku")
@RequiredArgsConstructor
public class SkuHandler implements EntryHandler<Sku> {
//
//    private final SkuSearchFeign skuSearchFeign;
//
//    @Override
//    public void insert(Sku sku) {
//        skuSearchFeign.add(JSON.parseObject(JSON.toJSONString(sku), SkuEs.class));
//    }
//
//    @Override
//    public void update(Sku before, Sku after) {
//        if (after.getStatus() == 2) {
//            skuSearchFeign.del(after.getId());
//        } else {
//            skuSearchFeign.add(JSON.parseObject(JSON.toJSONString(after), SkuEs.class));
//        }
//    }
//
//    @Override
//    public void delete(Sku sku) {
//        skuSearchFeign.del(sku.getId());
//    }
}
