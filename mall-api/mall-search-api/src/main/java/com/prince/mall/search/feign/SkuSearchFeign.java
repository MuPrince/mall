package com.prince.mall.search.feign;

import com.prince.mall.search.entity.SkuEs;
import com.prince.mall.util.RespResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

/**
 * Project mall <br\>
 * Package com.prince.mall.search.feign <br\>
 * <p>
 * Description : Sku搜索feign接口 <br\>
 *
 * @author StrangePrince <br\>
 * @since 2021/9/1 22:22
 */
@FeignClient("mall-search")
@RequestMapping("skuSearch")
public interface SkuSearchFeign {

    /**
     * Description :  添加索引
     * @param skuEs {@link SkuEs}
     * @return com.prince.mall.util.RespResult
     * @throws
     * @since 2021/9/1 22:17
     * @author StrangePrince
     */
    @PostMapping("add")
    RespResult add(@RequestBody SkuEs skuEs);

    /**
     * Description : 删除索引
     * @param id
     * @return com.prince.mall.util.RespResult
     * @throws
     * @since 2021/9/1 22:19
     * @author StrangePrince
     */
    @DeleteMapping("{id}")
    RespResult del(@PathVariable String id);
}
