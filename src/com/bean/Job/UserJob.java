package com.bean.Job;

public class UserJob implements IUserJob {

    public UserJob() {
    }

    @Override
    public void UpdateUserInfo(String name) {
        System.out.println("用户信息已更新为：" + name);
    }
}
