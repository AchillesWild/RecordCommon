package com.achilles.record.entity.user;

import com.achilles.model.entity.BaseEntity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserDetail extends BaseEntity {

    private String userUuid;

    private Integer question1;

    private String answer1;

    private Integer question2;

    private String answer2;

    private Integer question3;

    private String answer3;

}