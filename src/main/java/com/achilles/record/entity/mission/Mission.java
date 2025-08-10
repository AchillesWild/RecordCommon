package com.achilles.record.entity.mission;

import com.achilles.model.entity.BaseEntity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Mission extends BaseEntity {

    private String title;

    private String content;

    private Integer type;

    private String userUuid;

    private Integer pace;

    private Integer percent;

    private Integer hasImg;

    private String compressImgUrl;

    private String imgUrl;

}