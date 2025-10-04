package com.achilles.record.entity.note;

import com.achilles.model.entity.BaseEntity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class NoteUpdateLog extends BaseEntity {

    private String type;

    private String traceId;
}
