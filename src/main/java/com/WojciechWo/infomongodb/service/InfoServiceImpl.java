package com.WojciechWo.infomongodb.service;

import com.WojciechWo.infomongodb.repository.InfoRepo;
import com.WojciechWo.infomongodb.collection.Info;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InfoServiceImpl implements InfoService{


    @Autowired
    private InfoRepo infoRepo;
    @Override
    public String save(Info info) {
        return infoRepo.save(info).getId();
    }
}
