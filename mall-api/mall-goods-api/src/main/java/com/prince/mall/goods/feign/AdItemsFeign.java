package com.prince.mall.goods.feign;

import com.prince.mall.goods.entity.AdItems;
import com.prince.mall.goods.entity.Sku;
import com.prince.mall.util.RespResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Project mall <br\>
 * Package com.prince.mall.goods.feign <br\>
 * <p>
 * Description : sku feign接口 <br\>
 *
 * @author StrangePrince <br\>
 * @since 2021/8/30 22:25
 */
@FeignClient("mall-goods")
@RequestMapping("adItems")
public interface AdItemsFeign {
    @GetMapping("type/{type}")
    RespResult<List<Sku>> getAdItemsByType(@PathVariable Integer type);

    @DeleteMapping("{id}")
    RespResult deleteAdItemsById(@PathVariable Integer id);

    @PutMapping("save")
    RespResult saveAdItems(@RequestBody AdItems adItems);
}
