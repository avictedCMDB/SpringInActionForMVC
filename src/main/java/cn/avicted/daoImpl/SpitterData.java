package cn.avicted.daoImpl;

import cn.avicted.dao.SpitterRepository;
import cn.avicted.model.Spitter;
import org.springframework.stereotype.Repository;


/**
 * @ClassName SpitterData
 * @Description TODO
 * @Author xulei
 * @Date 2019/5/13/013 9:19
 * @Version 1.0
 **/
@Repository
public class SpitterData implements SpitterRepository {

    @Override
    public Spitter findByUsername(String username) {
        //System.out.println("findByUsername方法 " + "根据用户名查找Spitter    " + username);
        Spitter spitter = new Spitter();
        spitter.setFirstName("xu");
        spitter.setLastName("lei");
        spitter.setUserName("xulei");
        spitter.setPassword("12345678");
        return spitter;
    }

    @Override
    public Boolean save(Spitter spitter) {
        //System.out.println("save方法：" + spitter.getUserName() + "  save 成功！！");
        return true;
    }


}
