package com.FileResourse;

import com.FileResourse.FileService.FileIO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;
import test.com.imooc.TestClassTest;

import java.io.IOException;

@RunWith(BlockJUnit4ClassRunner.class)
public class IoFileTest extends TestClassTest {
    public IoFileTest() {
        super("spring-resourse.xml");
    }

    /*
    文件操作案例
     */
    @Test
    public void getFile(){
        FileIO fileIO = super.getBean("fileIo");
        try {
            fileIO.resourse();
        } catch (IOException e) {
            System.out.println(e.getMessage());;
        }
    }

}
