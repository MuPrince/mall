package com.prince.mall.goods.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Project mall <br\>
 * Package com.prince.mall.goods.entity <br\>
 * <p>
 * Description : SPU信息 <br\>
 *
 * @author StrangePrince <br\>
 * @since 2021/8/28 23:04
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "spu")
public class Spu {
    @TableId(type = IdType.ASSIGN_ID)
    private String id;
    /**
     * spu名称
     */
    private String name;
    /**
     * 简介
     */
    private String intro;
    /**
     * 品牌ID
     */
    private Integer brandId;
    /**
     * 一级分类ID
     */
    private Integer categoryOneId;
    /**
     * 二级分类ID
     */
    private Integer categoryTwoId;
    /**
     * 三级分类ID
     */
    private Integer categoryThreeId;
    /**
     * 图片列表
     */
    private String images;
    /**
     * 售后服务
     */
    private String afterSalesService;
    /**
     * 内容介绍
     */
    private String content;
    /**
     * 属性规格列表
     */
    private String attributeList;
    /**
     * 是否上架,0已下架，1已上架
     */
    private Integer isMarketable;
    /**
     * 是否删除,0:未删除，1：已删除
     */
    private Integer isDelete;
    /**
     * 审核状态，0：未审核，1：已审核，2：审核不通过
     */
    private Integer status;
}
