package com.achilles.record.entity.user;

import com.achilles.model.entity.BaseEntity;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class UserToken extends BaseEntity {


    private String token;

    private String userAgent;

    private String remoteHost;

    private long expirationTime;

    private Date expirationDate;

}