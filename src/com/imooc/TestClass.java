package com.imooc;


import com.imooc.Service.IBeanService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;
import test.com.imooc.TestClassTest;

@RunWith(BlockJUnit4ClassRunner.class)
public class TestClass extends TestClassTest {



    public TestClass() {
        super("classpath:spring-injection.xml");
    }

    @Test
    public void Test(){

        IBeanService ben = super.getBean("IBeanService");
        ben.GetJobName("123");
    }

}
