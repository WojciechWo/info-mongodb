package com.WojciechWo.infomongodb.repository;

import com.WojciechWo.infomongodb.collection.Info;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface InfoRepo extends MongoRepository<Info, String> {

}
