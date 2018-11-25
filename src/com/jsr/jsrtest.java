package com.jsr;

import com.jsr.jsrclass.JsrService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;
import test.com.imooc.TestClassTest;

@RunWith(BlockJUnit4ClassRunner.class)
public class jsrtest extends TestClassTest {
    public jsrtest() {
        super("classpath:spring-jsrinjection.xml");
    }

    @Test
    public void testSave(){
        JsrService jsrService = super.getBean("jsrService");
        jsrService.save();
    }
}
