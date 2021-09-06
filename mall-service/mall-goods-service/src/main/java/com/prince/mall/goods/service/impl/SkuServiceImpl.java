package com.prince.mall.goods.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.prince.mall.goods.entity.Sku;
import com.prince.mall.goods.mapper.SkuMapper;
import com.prince.mall.goods.service.SkuService;
import org.springframework.stereotype.Service;

/**
 * Project mall <br\>
 * Package com.prince.mall.goods.service.impl <br\>
 * <p>
 * Description : sku服务实现类 <br\>
 *
 * @author StrangePrince <br\>
 * @since 2021/9/6 22:16
 */
@Service
public class SkuServiceImpl extends ServiceImpl<SkuMapper, Sku> implements SkuService {
}
