package com.achilles.record.entity.finance;

import com.achilles.model.entity.BaseEntity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FinanceTransfer extends BaseEntity {

    private Long amount;

    private Integer flowType;

    private String related;

    private Integer tradeDate;

    private Integer hasImg;

    private String compressImgUrl;

    private String imgUrl;

    private String remark;

}