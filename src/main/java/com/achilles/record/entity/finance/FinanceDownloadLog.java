package com.achilles.record.entity.finance;

import com.achilles.model.entity.BaseEntity;

public class FinanceDownloadLog extends BaseEntity {

    private Integer type;

    private Integer downloadDate;

    private Integer downloadMonth;

    private String traceId;

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getDownloadDate() {
        return downloadDate;
    }

    public void setDownloadDate(Integer downloadDate) {
        this.downloadDate = downloadDate;
    }

    public Integer getDownloadMonth() {
        return downloadMonth;
    }

    public void setDownloadMonth(Integer downloadMonth) {
        this.downloadMonth = downloadMonth;
    }

    public String getTraceId() {
        return traceId;
    }

    public void setTraceId(String traceId) {
        this.traceId = traceId;
    }
}
