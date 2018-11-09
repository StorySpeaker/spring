package com.bean;

import com.bean.Service.IUserService;
import org.junit.Test;

public class beanTest {

    private IUserService IUserService;

    public beanTest(IUserService iUserService) {
        this.IUserService = iUserService;
    }

    @Test
    public void Test(){
        IUserService.UpdateUserInfo("注解");
    }
}
