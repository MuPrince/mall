package com.prince.mall.goods.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.prince.mall.goods.entity.SkuAttribute;

import java.util.List;

/**
 * Project mall <br\>
 * Package com.prince.mall.goods.service <br\>
 * <p>
 * Description : Sku属性 <br\>
 *
 * @author StrangePrince <br\>
 * @since 2021/8/29 12:42
 */
public interface SkuAttributeService extends IService<SkuAttribute> {
    List<SkuAttribute> queryListByCategoryId(Integer categoryId);
}
