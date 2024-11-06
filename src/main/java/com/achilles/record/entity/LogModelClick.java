package com.achilles.record.entity;

import com.achilles.model.entity.BaseEntity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LogModelClick extends BaseEntity {

    private String modelCode;

    private String functionCode;

    private Integer time;

    private String traceId;

}
