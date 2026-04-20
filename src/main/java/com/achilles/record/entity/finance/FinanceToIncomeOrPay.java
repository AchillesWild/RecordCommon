package com.achilles.record.entity.finance;

import com.achilles.model.entity.BaseEntity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FinanceToIncomeOrPay extends BaseEntity {

    private Long amount;

    private Long paidAmount;

    private Integer flowType;

    private String related;

    private String transaction;

    private Integer tradeDate;

    private Integer appointedDate;

    private Integer finishDate;

    private Integer hasImg;

    private Integer pace;

    private String compressImgUrl;

    private String imgUrl;

    private String remark;

}