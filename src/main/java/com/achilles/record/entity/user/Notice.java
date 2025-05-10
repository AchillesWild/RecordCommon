package com.achilles.record.entity.user;

import com.achilles.model.entity.BaseEntity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Notice extends BaseEntity {


    private String content;

    private Integer hasImg;

    private String imgUrl;

    private String startTime;

    private String endTime;

    private Integer enable;

    private Integer repeated;

}