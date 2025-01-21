package com.achilles.record.entity;

import com.achilles.model.entity.BaseEntity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Notes extends BaseEntity {

    private String title;

    private String content;

    private Integer type;

    private String userUuid;

    private Integer hasImg;

    private String imgUrl;

    private String compressImgUrl;

}