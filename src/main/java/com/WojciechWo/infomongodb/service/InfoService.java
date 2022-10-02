package com.WojciechWo.infomongodb.service;

import com.WojciechWo.infomongodb.collection.Comment;
import com.WojciechWo.infomongodb.collection.Info;

import java.util.List;

public interface InfoService {
    String save(Info info);

    List<Info> getInfoStartWith(String author);

    void delate(String id);


}
