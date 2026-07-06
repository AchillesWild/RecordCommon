package com.achilles.record.entity.mission;

import com.achilles.model.entity.BaseEntity;


public class Mission extends BaseEntity {

    private String title;

    private String content;

    private Integer type;

    private String userUuid;

    private Integer pace;

    private Integer percent;

    private Integer hasImg;

    private String compressImgUrl;

    private String imgUrl;

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getCompressImgUrl() {
        return compressImgUrl;
    }

    public void setCompressImgUrl(String compressImgUrl) {
        this.compressImgUrl = compressImgUrl;
    }

    public Integer getHasImg() {
        return hasImg;
    }

    public void setHasImg(Integer hasImg) {
        this.hasImg = hasImg;
    }

    public Integer getPercent() {
        return percent;
    }

    public void setPercent(Integer percent) {
        this.percent = percent;
    }

    public Integer getPace() {
        return pace;
    }

    public void setPace(Integer pace) {
        this.pace = pace;
    }

    @Override
    public String getUserUuid() {
        return userUuid;
    }

    @Override
    public void setUserUuid(String userUuid) {
        this.userUuid = userUuid;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}