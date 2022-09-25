package com.WojciechWo.infomongodb.collection;

import com.WojciechWo.infomongodb.collection.Comment;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Builder
@Document(collection = "info")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Info {
    @Id
    private String id;
    private String author;
    private String tittle;
    private List<Comment> commentList;
}
