package com.autowire.wireService;

import com.autowire.wireResposity.InjectionDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InjectionServiceImpl implements InjectionService {

    //@Autowired
    private InjectionDAO injectionDAO;

    //@Autowired
    public void setInjectionDAO(InjectionDAO injectionDAO) {
        this.injectionDAO = injectionDAO;
    }
    @Autowired
    public InjectionServiceImpl(InjectionDAO injectionDAO) {
        this.injectionDAO = injectionDAO;
    }

    @Override
    public void save(String name) {
        //模拟业务层操作
        System.out.println("业务层接收参数：" + name);
        name = name + this.hashCode();
        injectionDAO.save(name);
    }
}
