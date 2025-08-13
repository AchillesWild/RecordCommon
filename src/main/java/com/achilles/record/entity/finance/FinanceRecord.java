package com.achilles.record.entity.finance;

import com.achilles.model.entity.BaseEntity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FinanceRecord extends BaseEntity {

    private Long amount;

    private Integer hasImg;

    private String compressImgUrl;

    private String imgUrl;

    private String transactionType;

    private String remark;

    private Integer tradeDate;

}