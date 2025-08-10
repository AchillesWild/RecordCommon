package com.achilles.record.entity.comment;

import com.achilles.model.entity.BaseEntity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
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
}