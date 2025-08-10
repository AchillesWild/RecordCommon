package com.achilles.record.entity.goods;

import com.achilles.model.entity.BaseEntity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GoodsSupplier extends BaseEntity {

    private String name;

    private Integer supplierType;

    private Integer sort;

    private String service;

    private String mobile;

    private String otherContact;

    private String email;

    private String address;

    private Long version;

    private String remark;

    private String userUuid;

}