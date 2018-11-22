package com.Configuration.conclass;

public class StoreClass implements Store {
    @Override
    public void destroy() {
        System.out.println("This is destroy.");
    }

    @Override
    public void init() {
        System.out.println("This is init.");
    }
}
