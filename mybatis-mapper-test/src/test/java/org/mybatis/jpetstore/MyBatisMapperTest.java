package org.mybatis.jpetstore;

import kr.sadalmelik.mybatis.mapper.MyBatisMapper;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:/context/applicationContext.xml"})
public abstract class MyBatisMapperTest{

    @Autowired
    SqlSessionFactory sqlSessionFactory;

    @Test
    public abstract void run();

    @After
    public void tearDown() throws InterruptedException {
        while (true) {
            Thread.sleep(2000);
        }
    }
}
