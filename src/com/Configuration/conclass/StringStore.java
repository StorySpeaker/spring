package com.Configuration.conclass;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StringStore {

    @Bean(name = "store")
    public Store storeClass(){
        return new StoreClass();
    }

}
