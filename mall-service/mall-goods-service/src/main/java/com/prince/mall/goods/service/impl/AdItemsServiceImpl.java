package com.prince.mall.goods.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.prince.mall.goods.entity.AdItems;
import com.prince.mall.goods.entity.Sku;
import com.prince.mall.goods.mapper.AdItemsMapper;
import com.prince.mall.goods.mapper.SkuMapper;
import com.prince.mall.goods.service.AdItemsService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.lang.reflect.Type;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Project mall <br\>
 * Package com.prince.mall.goods.service.impl <br\>
 * <p>
 * Description : 首页推广产品服务实现 <br\>
 *
 * @author StrangePrince <br\>
 * @since 2021/8/28 22:23
 */
@Service
@RequiredArgsConstructor
public class AdItemsServiceImpl extends ServiceImpl<AdItemsMapper, AdItems> implements AdItemsService {

    private final SkuMapper skuMapper;

    private final AdItemsMapper adItemsMapper;

    @Override
    public List<Sku> queryAdItemsByType(Integer adItemsType) {
        long start = System.currentTimeMillis();
//        List<String> skuIds = adItemsMapper.findSkuIdsByAdItemsType(adItemsType);
        //根据type查询推广产品列表
        List<AdItems> adItems = adItemsMapper.selectList(new QueryWrapper<AdItems>().eq("type", adItemsType));
        //流处理获得skuId集合
        List<String> skuIds = adItems.stream().map(AdItems::getSkuId).collect(Collectors.toList());
        //查询推广产品信息
        List<Sku> skus = skuMapper.selectBatchIds(skuIds);
        long end = System.currentTimeMillis();
        System.out.println(end - start);

        return skus;
    }
}
