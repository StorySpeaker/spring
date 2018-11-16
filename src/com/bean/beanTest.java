package com.bean;

import com.bean.Service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;
import test.com.imooc.TestClassTest;

@RunWith(BlockJUnit4ClassRunner.class)
public class beanTest extends TestClassTest {

    public beanTest() {
        super("classpath:autobean.xml");
    }

    /*
    Bean自动装配实践
     */
    @Test
    public void Test()
    {
        UserService service = super.getBean("userService");
        service.say("burand");
    }
}
