package com.WojciechWo.infomongodb;

import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Component;

@Component
public class MongoDbConfing {
    private MongoTemplate mongoTemplate;
}
