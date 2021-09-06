package com.prince.mall.goods.feign;

import com.prince.mall.goods.entity.Sku;
import com.prince.mall.util.RespResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Project mall <br\>
 * Package com.prince.mall.goods.feign <br\>
 * <p>
 * Description : sku feign接口 <br\>
 *
 * @author StrangePrince <br\>
 * @since 2021/9/6 22:23
 */
@FeignClient("mall-goods")
@RequestMapping("sku")
public interface SkuFeign {

    /**
     * Description :  根据ID查询商品详情
     * @param id
     * @return com.prince.mall.util.RespResult<com.prince.mall.goods.entity.Sku>
     * @throws
     * @since 2021/9/6 22:22
     * @author StrangePrince
     */
    @GetMapping("{id}")
    RespResult<Sku> getSkuById(@PathVariable String id);
}
