package com.WojciechWo.infomongodb.service;

import com.WojciechWo.infomongodb.collection.Comment;
import com.WojciechWo.infomongodb.repository.InfoRepo;
import com.WojciechWo.infomongodb.collection.Info;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InfoServiceImpl implements InfoService {


    @Autowired
    private InfoRepo infoRepo;

    @Override
    public String save(Info info) {
        return infoRepo.save(info).getId();
    }

    @Override
    public List<Info> getInfoStartWith(String author) {

        return infoRepo.findByAuthorStartsWith(author);
    }

    @Override
    public void delate(String id) {
        infoRepo.deleteById(id);

    }

}
