package com.WojciechWo.infomongodb;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Document
public class Info {
    @Id
    private String Id;

    private String author;

    private String tittle;

    private List<Comment> commentList;
}
