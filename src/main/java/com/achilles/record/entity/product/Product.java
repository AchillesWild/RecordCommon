package com.achilles.record.entity.product;

import com.achilles.model.entity.BaseEntity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Product extends BaseEntity {

    private String name;

    private String code;

    private Integer sort;

    private Integer unit;

    private Integer hasImg;

    private String compressImgUrl;

    private String imgUrl;

    private String description;

    private Long version;
}