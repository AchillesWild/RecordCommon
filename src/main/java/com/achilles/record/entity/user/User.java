package com.achilles.record.entity.user;

import com.achilles.model.entity.BaseEntity;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class User extends BaseEntity {

    private String userName;

    private String nickName;

    private String password;

    private String email;

    private String mobile;

    private Integer gender;

    private String imgUrl;

    private Integer homePage;

    private Integer loginTimes;

    private Integer proved;

    private String parentUserUuid;

    private String sharePages;

    private Long version;

    private Integer role;

    private Date loginDate;

    private Date lastLoginDate;
}