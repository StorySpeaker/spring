package com.ValueResourse.valueclass;

import javax.sound.midi.Soundbank;

public class Driver {

    private String url;

    private String name;

    private String password;

    public Driver(String url, String name, String password) {
        this.url = url;
        this.name = name;
        this.password = password;
        say();
    }

//    public Driver(String url, String name, String password) {
//        System.out.println("url : " + url);
//        System.out.println("name : " + name);
//        System.out.println("password : " + password);
//    }

    public void say() {
        System.out.println("url : " + this.url);
        System.out.println("name : " + this.name);
        System.out.println("password : " + this.password);
    }
}
