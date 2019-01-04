package com.adc.tableau.tableauSever.util;

import com.mongodb.DBObject;
import org.bson.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 和mongo交互的类
 */
@Repository
public class MongoTemplateUtils {

    @Autowired
    org.springframework.data.mongodb.core.MongoTemplate mongoTemplate;

    public List<Document> findAll(String collectionName,int skip,int limit){
        List<Document> dbObjects = mongoTemplate.find(new Query().skip(skip*limit).limit(limit), Document.class, collectionName);
        return dbObjects;
    }

    public Long countByCollectionName(String collectionName){
        return mongoTemplate.count(new Query(),collectionName);
    }

}
