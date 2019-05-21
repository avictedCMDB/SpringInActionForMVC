package cn.avicted.mongoDB.config;

import com.mongodb.MongoClient;
import com.mongodb.MongoCredential;
import com.mongodb.ServerAddress;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @ClassName MongoConfig1
 * @Description 功能和MongoConfig一样，但是更加简洁（虽然没有直接声明MongoTemplate bean， 但是会被隐式地创建）
 * @Author xulei
 * @Date 2019/5/21/021 8:58
 * @Version 1.0
 **/
@Configuration
@EnableMongoRepositories("cn.avicted.mongoDB")
public class MongoConfig1 extends AbstractMongoConfiguration {

    @Autowired
    private Environment env;


    @Override
    public MongoClient mongoClient() {
        return new MongoClient("mongoDBServerAdress", 27017);
    }

    @Override
    protected String getDatabaseName() {
        return "OrderDB";
    }


    /////////////////////////////////////////////////
    public MongoClient mongoClient1() {
        ServerAddress serverAddress = new ServerAddress("localhost", 27017);
        List<ServerAddress> addresslist = new ArrayList<>();
        addresslist.add(serverAddress);

        MongoCredential credential = MongoCredential.createCredential(env.getProperty("mongo.username"),
                env.getProperty("mongo.database"),
                env.getProperty("mongo.password").toCharArray());
        List<MongoCredential> credentialList = new ArrayList<>();
        credentialList.add(credential);

        MongoClient mongoClient = new MongoClient(addresslist, credentialList);

        return mongoClient;
    }



}
