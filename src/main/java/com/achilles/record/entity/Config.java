package com.achilles.record.entity;

import com.achilles.model.entity.BaseEntity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Config extends BaseEntity {

    private String code;

    private String val;

    private String description;

}
