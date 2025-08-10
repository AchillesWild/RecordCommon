package com.achilles.record.entity.common;

import com.achilles.model.entity.BaseEntity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class NoticeUser extends BaseEntity {

    private String noticeUuid;

    private String userUuid;

    private Integer closeRepeat;
}
