package com.imooc.Job;

public class BeanJob implements IBeanJob {

    public void GetName(String name){
        System.out.println("底层输出："+name);
    }
}
