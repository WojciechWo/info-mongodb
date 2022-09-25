package com.WojciechWo.infomongodb.controller;

import com.WojciechWo.infomongodb.collection.Info;
import com.WojciechWo.infomongodb.service.InfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/info")
public class InfoController {
    @Autowired
    private InfoService infoService;
    @PostMapping
    public  String save(@RequestBody Info info){
        return infoService.save(info);

    }
}
