package com.imooc.Service;

import com.imooc.Job.IBeanJob;

public class BeanService implements IBeanService{

    public IBeanJob iBeanJob;

    public BeanService(IBeanJob iBeanJob) {
        this.iBeanJob = iBeanJob;
    }

    @Override
    public void GetJobName(String name) {
        System.out.println("业务层输出："+name);
        iBeanJob.GetName(name);
    }
}
