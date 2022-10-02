package com.WojciechWo.infomongodb.collection;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Comment {

    private String id;
    private String text;

}
