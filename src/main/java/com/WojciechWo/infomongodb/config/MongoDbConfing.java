package com.WojciechWo.infomongodb.config;

import com.WojciechWo.infomongodb.collection.Comment;
import com.WojciechWo.infomongodb.collection.Info;
import com.WojciechWo.infomongodb.repository.InfoRepo;
import com.github.javafaker.Faker;
import lombok.Data;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
@Data
public class MongoDbConfing {
    private MongoTemplate mongoTemplate;

 //   private InfoRepo infoRepo;


    //    @Transactional
//    public void tryAddElement() {
//        Faker fakerHC = new Faker();
//        Info articleHC = new Info();
//
//
//        Comment comment1HC = new Comment();
//        comment1HC.setText(fakerHC.chuckNorris().fact());
//        Comment comment2HC = new Comment();
//        comment2HC.setText(fakerHC.chuckNorris().fact());
//        articleHC.setCommentList(Arrays.asList(comment1HC, comment2HC));
//        infoRepo.save(articleHC);
//
//    }
//
//
//    @EventListener(ApplicationReadyEvent.class)
//    public void init() {
//
//
//        Faker fakerHC = new Faker();
//        Info articleHC = new Info();
//
//
//        Comment comment1HC = new Comment();
//        comment1HC.setText(fakerHC.chuckNorris().fact());
//        Comment comment2HC = new Comment();
//        comment2HC.setText(fakerHC.chuckNorris().fact());
//        articleHC.setCommentList(Arrays.asList(comment1HC, comment2HC));
//        infoRepo.save(articleHC);
//
//
//        int index = 0;
//        while (index < 10) {
//            Faker faker = new Faker();
//            Info article = new Info();
//            article.setAuthor(faker.gameOfThrones().character());
//
//
//            Comment comment1 = new Comment();
//            comment1.setText(faker.chuckNorris().fact());
//            Comment comment2 = new Comment();
//            comment2.setText(faker.chuckNorris().fact());
//
//            article.setCommentList(Arrays.asList(comment1, comment2));
//
//            mongoTemplate.insert(article);
//            index++;
//        }
//
//        List<Info> all = mongoTemplate.findAll(Info.class);
//
//        Query query = new Query((Criteria.where("author").is("Witek")));
//        List<Info> byWitek = mongoTemplate.find(query, Info.class, "article");
//
//        System.out.println("wszystkie: " + all);
//    }
}
