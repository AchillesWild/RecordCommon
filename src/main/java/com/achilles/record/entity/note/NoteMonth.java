package com.achilles.record.entity.note;

import com.achilles.model.entity.BaseEntity;

public class NoteMonth extends BaseEntity {

    private Integer month;

    private Integer count;

    private Integer imgCount;

    public Integer getMonth() {
        return month;
    }

    public void setMonth(Integer month) {
        this.month = month;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Integer getImgCount() {
        return imgCount;
    }

    public void setImgCount(Integer imgCount) {
        this.imgCount = imgCount;
    }
}
