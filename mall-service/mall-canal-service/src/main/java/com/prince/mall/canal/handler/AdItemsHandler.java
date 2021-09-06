package com.prince.mall.canal.handler;

import com.prince.mall.goods.entity.AdItems;
import com.prince.mall.goods.feign.AdItemsFeign;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import top.javatool.canal.client.annotation.CanalTable;
import top.javatool.canal.client.handler.EntryHandler;

import java.util.Objects;

/**
 * Project mall <br\>
 * Package com.prince.mall.canal.listener <br\>
 * <p>
 * Description : 监听ad_items表 <br\>
 *
 * @author StrangePrince <br\>
 * @since 2021/8/31 20:15
 */
@Component
@CanalTable("ad_items")
@RequiredArgsConstructor
public class AdItemsHandler implements EntryHandler<AdItems> {

    private final AdItemsFeign adItemsFeign;


    /**
     * Description :  增加
     * @param adItems
     * @return void
     * @throws
     * @since 2021/8/31 20:18
     * @author StrangePrince
     */
    @Override
    public void insert(AdItems adItems) {
        adItemsFeign.updateAdItemsById(adItems);
    }

    /**
     * Description :  修改
     * @param before
     * @param after
     * @return void
     * @throws
     * @since 2021/8/31 20:18
     * @author StrangePrince
     */
    @Override
    public void update(AdItems before, AdItems after) {
        if (before.getType() != null && !Objects.equals(before.getType(), after.getType())) {
            adItemsFeign.updateAdItemsById(before);
        }
        adItemsFeign.updateAdItemsById(after);
    }

    /**
     * Description :  删除
     * @param adItems
     * @return void
     * @throws
     * @since 2021/8/31 20:18
     * @author StrangePrince
     */
    @Override
    public void delete(AdItems adItems) {
        adItemsFeign.deleteAdItemsById(adItems.getId());
    }
}
