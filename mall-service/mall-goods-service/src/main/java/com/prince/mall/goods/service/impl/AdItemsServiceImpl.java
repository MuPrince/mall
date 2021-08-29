package com.prince.mall.goods.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.prince.mall.goods.entity.AdItems;
import com.prince.mall.goods.mapper.AdItemsMapper;
import com.prince.mall.goods.service.AdItemsService;
import org.springframework.stereotype.Service;

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
public class AdItemsServiceImpl extends ServiceImpl<AdItemsMapper, AdItems> implements AdItemsService {
}
