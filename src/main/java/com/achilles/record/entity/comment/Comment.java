package com.achilles.record.entity.comment;

import com.achilles.model.entity.BaseEntity;


public class Comment extends BaseEntity {

    private String targetUuid;

    private String content;

    private String imgUrl;

    private String userUuid;

    private String parentCommentUuid;

    private String rootCommentUuid;

    private Integer likeCount;

    private Integer commentCount;

    private Integer isOpen;

    public String getTargetUuid() {
        return targetUuid;
    }

    public void setTargetUuid(String targetUuid) {
        this.targetUuid = targetUuid;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    @Override
    public String getUserUuid() {
        return userUuid;
    }

    @Override
    public void setUserUuid(String userUuid) {
        this.userUuid = userUuid;
    }

    public String getParentCommentUuid() {
        return parentCommentUuid;
    }

    public void setParentCommentUuid(String parentCommentUuid) {
        this.parentCommentUuid = parentCommentUuid;
    }

    public String getRootCommentUuid() {
        return rootCommentUuid;
    }

    public void setRootCommentUuid(String rootCommentUuid) {
        this.rootCommentUuid = rootCommentUuid;
    }

    public Integer getLikeCount() {
        return likeCount;
    }

    public void setLikeCount(Integer likeCount) {
        this.likeCount = likeCount;
    }

    public Integer getCommentCount() {
        return commentCount;
    }

    public void setCommentCount(Integer commentCount) {
        this.commentCount = commentCount;
    }

    public Integer getIsOpen() {
        return isOpen;
    }

    public void setIsOpen(Integer isOpen) {
        this.isOpen = isOpen;
    }
}