package com.prince.mall.goods.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.prince.mall.goods.entity.SkuAttribute;
import com.prince.mall.goods.mapper.SkuAttributeMapper;
import com.prince.mall.goods.service.SkuAttributeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Project mall <br\>
 * Package com.prince.mall.goods.service.impl <br\>
 * <p>
 * Description : Sku属性实现 <br\>
 *
 * @author StrangePrince <br\>
 * @since 2021/8/29 12:43
 */
@Service
@RequiredArgsConstructor
public class SkuAttributeServiceImpl extends ServiceImpl<SkuAttributeMapper, SkuAttribute> implements SkuAttributeService {

    private final SkuAttributeMapper skuAttributeMapper;

    @Override
    public List<SkuAttribute> queryListByCategoryId(Integer categoryId) {
//        List<Integer> ids = skuAttributeMapper.findIdsByCategoryId(categoryId);
//        if (ids != null && ids.size() > 0) {
//            return skuAttributeMapper.selectList(new QueryWrapper<SkuAttribute>().in("id",ids));
//        }
//        return null;
        return skuAttributeMapper.findSkuAttributesByCategoryId(categoryId);
    }
}
