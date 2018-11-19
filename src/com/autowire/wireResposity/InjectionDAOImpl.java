package com.autowire.wireResposity;

import org.springframework.stereotype.Repository;

@Repository
public class InjectionDAOImpl implements InjectionDAO {
    @Override
    public void save(String name) {
        System.out.println("print name + " + name);
    }
}
