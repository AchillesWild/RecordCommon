package com.achilles.record.entity.note;

import com.achilles.model.entity.BaseEntity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class NoteMonth extends BaseEntity {

    private Integer month;

    private Integer count;

    private Integer imgCount;
}
