package com.prince.mall.search.mapper;

import com.prince.mall.search.entity.SkuEs;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * Project mall <br\>
 * Package com.prince.mall.search.mapper <br\>
 * <p>
 * Description : Sku搜索mapper <br\>
 *
 * @author StrangePrince <br\>
 * @since 2021/9/1 22:04
 */
public interface SkuSearchMapper extends ElasticsearchRepository<SkuEs,String> {
}
