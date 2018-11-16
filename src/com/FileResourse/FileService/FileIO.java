package com.FileResourse.FileService;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.core.io.Resource;

import java.io.IOException;

public class FileIO implements ApplicationContextAware {

    private ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext)
            throws BeansException {
        this.applicationContext = applicationContext;
    }

    public void resourse() throws IOException{
        Resource resource = applicationContext.getResource("test.txt");
        System.out.println(resource.getFilename());
        System.out.println(resource.contentLength());
    }
}
