package com.achilles.record.entity.user;

import com.achilles.model.entity.BaseEntity;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class Notice extends BaseEntity {


    private String content;

    private Integer hasImg;

    private String imgUrl;

    private Date startDateTime;

    private Date endDateTime;

    private Integer front;

    private Integer enable;

    private Integer repeated;

}