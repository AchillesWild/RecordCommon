package com.achilles.record.entity.common;

import com.achilles.model.entity.BaseEntity;


public class NoticeUser extends BaseEntity {

    private String noticeUuid;

    private String userUuid;

    private Integer closeRepeat;

    public String getNoticeUuid() {
        return noticeUuid;
    }

    public void setNoticeUuid(String noticeUuid) {
        this.noticeUuid = noticeUuid;
    }

    @Override
    public String getUserUuid() {
        return userUuid;
    }

    @Override
    public void setUserUuid(String userUuid) {
        this.userUuid = userUuid;
    }

    public Integer getCloseRepeat() {
        return closeRepeat;
    }

    public void setCloseRepeat(Integer closeRepeat) {
        this.closeRepeat = closeRepeat;
    }
}
