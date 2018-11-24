package com.Configuration.conclass;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;

@Configuration
public class StringStore {

    @Bean(name = "store",initMethod = "init", destroyMethod = "destroy")
    @Scope(value = "prototype", proxyMode = ScopedProxyMode.TARGET_CLASS)
    public Store storeClass(){
        return new StoreClass();
    }

}
