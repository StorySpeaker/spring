package com.bean.Service;

import com.bean.Job.UserJob;

public class UserService {

    private UserJob userJob;

    public void setUserJob(UserJob userJob) {
        this.userJob = userJob;
    }

    public UserService() {
    }

    public void say(String word){
        this.userJob.say(word);
    }
}
