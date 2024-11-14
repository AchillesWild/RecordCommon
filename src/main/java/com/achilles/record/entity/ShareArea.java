package com.achilles.record.entity;

import com.achilles.model.entity.BaseEntity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ShareArea extends BaseEntity {

    private String content;

    private String imgUrl;

    private String userUuid;

    private Integer likeCount;

    private Integer commentCount;

    private Integer isOpen;

}

