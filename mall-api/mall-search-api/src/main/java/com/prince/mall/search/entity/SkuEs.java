package com.prince.mall.search.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.io.Serializable;
import java.util.Date;
import java.util.Map;

/**
 * Project mall <br\>
 * Package com.prince.mall.search.entity <br\>
 * <p>
 * Description : Sku es对象 <br\>
 *
 * @author StrangePrince <br\>
 * @since 2021/9/1 21:44
 */
@Data
@Document(indexName = "shop_search", type = "sku_es")//indexName 索引库名字 type 与当前类对应的索引类型
public class SkuEs implements Serializable {
    @Id
    private String id;
    /**
     * SKU名称
     */
    @Field(type = FieldType.Text)
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
    @Field(type = FieldType.Keyword)
    private String categoryName;
    /**
     * 品牌ID
     */
    private Integer brandId;
    /**
     * 品牌名称
     */
    @Field(type = FieldType.Keyword)
    private String brandName;
    /**
     * sku规格属性
     */
    private String skuAttribute;
    /**
     * 商品状态 1-正常，2-下架，3-删除
     */
    private Integer status;
    /**
     * 属性映射
     */
    private Map<String, String> attrMap;
}
