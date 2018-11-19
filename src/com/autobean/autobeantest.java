package com.autobean;

import com.autobean.service.Jdbean;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;
import test.com.imooc.TestClassTest;

@RunWith(BlockJUnit4ClassRunner.class)
public class autobeantest extends TestClassTest {
    public autobeantest() {
        super("spring-autobean.xml");
    }

    /*
    bean注解
     */
    @Test
    public void getMethod() {
        Jdbean jd = super.getBean("jdbean");
        //Jdbean jd = super.getBean("bean");
        jd.sendname("good evening.");
    }

    /*
    scope单例测试
     */
    @Test
    public void ScopeTest() {
        Jdbean jd = super.getBean("jdbean");
        //Jdbean jd = super.getBean("bean");
        jd.gethashcode();

        jd = super.getBean("jdbean");
        jd.gethashcode();
    }
}
