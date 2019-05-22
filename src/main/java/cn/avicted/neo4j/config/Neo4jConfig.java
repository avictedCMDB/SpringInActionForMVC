package cn.avicted.neo4j.config;

import org.neo4j.graphdb.GraphDatabaseService;
import org.neo4j.graphdb.factory.GraphDatabaseFactory;
import org.neo4j.ogm.session.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.data.neo4j.config.Neo4jConfiguration;
import org.springframework.data.neo4j.repository.config.EnableNeo4jRepositories;
import org.springframework.data.neo4j.rest.SpringCypherRestGraphDatabase;

import java.io.File;

/**
 * @ClassName Neo4jConfig
 * @Description TODO
 * @Author xulei
 * @Date 2019/5/21/021 13:44
 * @Version 1.0
 **/
@Configuration
@EnableNeo4jRepositories(basePackages = "cn.avicted.neo4j")
public class Neo4jConfig extends Neo4jConfiguration {

    @Override
    @Bean
    public SessionFactory getSessionFactory() {
        return new SessionFactory("cn.avicted.neo4j");
    }

    /**
    * @Author xulei
    * @Description 配置嵌入式数据库
    * @Date 14:13 2019/5/21/021
    * @Param []
    * @return org.neo4j.graphdb.GraphDatabaseService
    **/
    public GraphDatabaseService graphDatabaseService() {
        File file = new File("/tmp/graphdb");
        return new GraphDatabaseFactory().newEmbeddedDatabase(file);
    }

    /**
    * @Author xulei
    * @Description 配置连接远程Neo4j服务器
    * @Date 14:14 2019/5/21/021
    * @Param []
    * @return org.neo4j.graphdb.GraphDatabaseService
    **/
    @Bean(destroyMethod = "shutdown")
    public GraphDatabaseService graphDatabaseService1(Environment env) {
        return new SpringCypherRestGraphDatabase("Http://graphdbserver:7474/db/data/",
                env.getProperty("db.username"),
                env.getProperty("db.password"));
    }


}
