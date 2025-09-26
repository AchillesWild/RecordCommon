package com.achilles.record.entity;

import com.achilles.model.entity.BaseEntity;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class IpBlackList extends BaseEntity {

    private String ip;

    private Date startDateTime;

    private Date endDateTime;

    private Integer enable;

    private String remark;
}
