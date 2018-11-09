package com.bean.Service;

import com.bean.Job.IUserJob;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserService {

    @Autowired
    @Qualifier("IUserJob")
    private IUserJob iUserJob;
    public UserService() {
    }

    @Override
    public void UpdateUserInfo(String name) {
        System.out.println("业务层中转用户信息！");
        iUserJob.UpdateUserInfo(name);
    }
}
