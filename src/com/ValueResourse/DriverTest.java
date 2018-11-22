package com.ValueResourse;

import com.ValueResourse.valueclass.DriverManager;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;
import test.com.imooc.TestClassTest;

@RunWith(BlockJUnit4ClassRunner.class)
public class DriverTest extends TestClassTest {
    public DriverTest() {
        super("classpath:spring-value.xml");
    }

    @Test
    public void say(){
        DriverManager va = super.getBean("driverManager");
        System.out.println(va.getClass().getName());
    }
}
