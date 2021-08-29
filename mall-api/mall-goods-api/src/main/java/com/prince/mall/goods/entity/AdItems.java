package com.prince.mall.goods.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * Project mall <br\>
 * Package com.prince.mall.goods.entity <br\>
 * <p>
 * Description : 首页推广产品（广告产品） <br\>
 *
 * @author StrangePrince <br\>
 * @since 2021/8/28 22:15
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("ad_items")
public class AdItems implements Serializable {

    /**
     * id
     */
    private Integer id;

    /**
     * 商品ID
     */
    private String skuId;

    /**
     * 名称
     */
    private String name;

    /**
     * 推广类型
     */
    private Integer type;

    /**
     * 排序
     */
    private Integer sort;
}
