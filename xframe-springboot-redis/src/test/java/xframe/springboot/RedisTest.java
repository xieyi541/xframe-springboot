package xframe.springboot;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;

import xframe.springboot.dao.redis.ValueRedisDao;
import xframe.springboot.main.WebMain;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner ;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(WebMain.class)
public class RedisTest {
 
    @Autowired
    private ValueRedisDao valueRedisDao;
 
    @Test
    public void test() throws Exception {
    this.valueRedisDao.save("LiangGzone");
    System.out.println(this.valueRedisDao.getParam());
    }
}
