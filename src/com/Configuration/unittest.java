package com.Configuration;

import com.Configuration.conclass.Store;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;
import test.com.imooc.TestClassTest;

@RunWith(BlockJUnit4ClassRunner.class)
public class unittest extends TestClassTest {
    public unittest() {
        super("classpath:spring-configuration.xml");
    }

    @Test
    public void say() {
        Store store = super.getBean("store");
        System.out.println(store.getClass().getName());
    }
}
