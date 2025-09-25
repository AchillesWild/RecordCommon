package com.achilles.record.entity;

import com.achilles.model.entity.BaseEntity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class IpBlackList extends BaseEntity {

    private String ip;

    private String startTime;

    private String endTime;

    private Integer enable;

    private String remark;
}
