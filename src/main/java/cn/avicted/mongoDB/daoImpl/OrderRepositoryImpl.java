package cn.avicted.mongoDB.daoImpl;

import cn.avicted.mongoDB.dao.OrderRepository;
import cn.avicted.mongoDB.model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

import java.util.List;
import java.util.Optional;

/**
 * @ClassName OrderRepositoryImpl
 * @Description TODO
 * @Author xulei
 * @Date 2019/5/21/021 11:15
 * @Version 1.0
 **/
public class OrderRepositoryImpl implements OrderRepository {

    @Autowired
    private MongoOperations mongo;

    @Override
    public List<Order> findOrderByType(String t) {
        String type = t.equals("NET") ? "WEB" : t;
        Criteria where = Criteria.where("type").is(type);
        Query query = Query.query(where);

        return mongo.find(query, Order.class);
    }


    @Override
    public <S extends Order> List<S> saveAll(Iterable<S> iterable) {
        return null;
    }

    @Override
    public List<Order> findAll() {
        return null;
    }

    @Override
    public List<Order> findAll(Sort sort) {
        return null;
    }

    @Override
    public <S extends Order> S insert(S s) {
        return null;
    }

    @Override
    public <S extends Order> List<S> insert(Iterable<S> iterable) {
        return null;
    }

    @Override
    public Page<Order> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Order> S save(S s) {
        return null;
    }

    @Override
    public Optional<Order> findById(String s) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(String s) {
        return false;
    }

    @Override
    public Iterable<Order> findAllById(Iterable<String> iterable) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(String s) {

    }

    @Override
    public void delete(Order order) {

    }

    @Override
    public void deleteAll(Iterable<? extends Order> iterable) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public <S extends Order> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Order> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends Order> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Order> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Order> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends Order> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }
}
