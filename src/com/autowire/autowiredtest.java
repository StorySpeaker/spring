package com.autowire;

import com.autowire.wireService.InjectionService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;
import test.com.imooc.TestClassTest;

@RunWith(BlockJUnit4ClassRunner.class)
public class autowiredtest extends TestClassTest {
    public autowiredtest() {
        super("classpath:spring-autowired.xml");
    }

    @Test
    public void testautowire(){
        InjectionService service = super.getBean("injectionServiceImpl");
        service.save("周杰伦");
    }
}
