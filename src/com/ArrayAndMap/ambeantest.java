package com.ArrayAndMap;

import com.ArrayAndMap.xmclass.AmInvoker;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;
import test.com.imooc.TestClassTest;

@RunWith(BlockJUnit4ClassRunner.class)
public class ambeantest extends TestClassTest {
    public ambeantest() {
        super("classpath:spring-ambean.xml");
    }

    @Test
    public void testsay(){
        AmInvoker bean = super.getBean("amInvoker");
        bean.say();
    }

}
