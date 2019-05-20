package cn.avicted.mongoDB.config;

import com.mongodb.client.MongoClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.MongoClientFactoryBean;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

/**
 * @ClassName MongoConfig
 * @Description TODO
 * @Author xulei
 * @Date 2019/5/17/017 14:46
 * @Version 1.0
 **/
@Configuration
@EnableMongoRepositories(basePackages = "cn.avicted.mongoDB")
public class MongoConfig {

    private MongoClient mongoClient;

    @Bean
    public MongoClientFactoryBean mongo() {
        MongoClientFactoryBean mongo = new MongoClientFactoryBean();
        mongo.setHost("localhost");
        return mongo;
    }

    @Bean
    public MongoOperations mongoTemplate() {

        return new MongoTemplate(mongoClient, "OrdersDB");
    }



}
