package cn.avicted.daoImpl;

import cn.avicted.dao.SpittleRepository;
import cn.avicted.model.Spittle;
import cn.avicted.utile.DateFormate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @ClassName CreateSpittle
 * @Description TODO
 * @Author xulei
 * @Date 2019/5/10/010 14:09
 * @Version 1.0
 **/
@Repository
public class SpittleData implements SpittleRepository {
    List<Spittle> spittles = new ArrayList<>();

    @Override
    public List<Spittle> findSpittles(long max, int count) {

        /*spittles.add(new Spittle("xulei", DateFormate.formateDate(new Date()), 34.56, 56.32));
        spittles.add(new Spittle("lihuichao", DateFormate.formateDate(new Date()), 89.63, 45.12));
        spittles.add(new Spittle("linyi", DateFormate.formateDate(new Date()), 456.32, 51.98));*/

        return spittles;
    }

    @Override
    public Spittle findOne(long spittleId) {
        for (Spittle spittle : spittles) {
            if (spittle.getId().equals(spittleId)){
                return spittle;
            }
        }
        return null;
    }

    @Override
    public Boolean saveSpittle(Spittle spittle) {
        System.out.println("saveSpittle方法：" + spittle.getMessage());
        return true;
    }


}
