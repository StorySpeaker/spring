package com.autobean.service;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component("bean")
@Scope("prototype") //调用对象每次重新new
//@Scope("singleton")  调用对象地址相同
@Component

public class Jdbean {

    public Jdbean() {
    }

    public void sendname(String name){
        System.out.println("Jdbean sayed:" + name);
    }

    public void gethashcode(){
        System.out.println("Jdbean hashcode:"+ this.hashCode());
    }


}
