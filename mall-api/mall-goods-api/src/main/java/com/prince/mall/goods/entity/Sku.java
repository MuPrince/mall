package com.prince.mall.goods.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * Project mall <br\>
 * Package com.prince.mall.goods.entity <br\>
 * <p>
 * Description : 商品Sku信息 <br\>
 *
 * @author StrangePrince <br\>
 * @since 2021/8/28 22:56
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "sku")
public class Sku implements Serializable {
    @TableId(type = IdType.ASSIGN_ID)
    private String id;
    /**
     * SKU名称
     */
    private String name;
    /**
     * 价格
     */
    private Integer price;
    /**
     * 库存数量
     */
    private Integer num;
    /**
     * 图片
     */
    private String image;
    /**
     * 图片列表
     */
    private String images;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 更新时间
     */
    private Date updateTime;
    /**
     * SPU-ID
     */
    private String spuId;
    /**
     * 分类ID
     */
    private Integer categoryId;
    /**
     * 分类名称
     */
    private String categoryName;
    /**
     * 品牌ID
     */
    private Integer brandId;
    /**
     * 品牌名称
     */
    private String brandName;
    /**
     * sku规格属性
     */
    private String skuAttribute;
    /**
     * 商品状态 1-正常，2-下架，3-删除
     */
    private Integer status;
}
