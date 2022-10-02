package com.WojciechWo.infomongodb.controller;

import com.WojciechWo.infomongodb.collection.Comment;
import com.WojciechWo.infomongodb.collection.Info;
import com.WojciechWo.infomongodb.service.InfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/info")
public class InfoController {
    @Autowired
    private InfoService infoService;
    @PostMapping
    public  String save(@RequestBody Info info){
        return infoService.save(info);
    }

    @GetMapping
    public List<Info> getInfotStartWith(@RequestParam ("author") String author){
        return infoService.getInfoStartWith(author);
    }
    @DeleteMapping("/{id}")
    public void detete(@PathVariable String id){
        infoService.delate(id);
    }




    }


