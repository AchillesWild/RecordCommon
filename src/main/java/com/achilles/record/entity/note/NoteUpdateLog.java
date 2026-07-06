package com.achilles.record.entity.note;

import com.achilles.model.entity.BaseEntity;


public class NoteUpdateLog extends BaseEntity {

    private String type;

    private String traceId;

    public String getTraceId() {
        return traceId;
    }

    public void setTraceId(String traceId) {
        this.traceId = traceId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
