package com.prince.mall.search.service.impl;

import com.prince.mall.search.entity.SkuEs;
import com.prince.mall.search.mapper.SkuSearchMapper;
import com.prince.mall.search.service.SkuSearchService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * Project mall <br\>
 * Package com.prince.mall.search.service.impl <br\>
 * <p>
 * Description : Sku 搜索服务实现 <br\>
 *
 * @author StrangePrince <br\>
 * @since 2021/9/1 22:07
 */
@Service
@RequiredArgsConstructor
public class SkuSearchServiceImpl implements SkuSearchService {

    private final SkuSearchMapper skuSearchMapper;

    @Override
    public void add(SkuEs skuEs) {
        skuSearchMapper.save(skuEs);
    }

    @Override
    public void del(String id) {
        skuSearchMapper.deleteById(id);
    }
}
