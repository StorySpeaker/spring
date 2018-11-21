package com.ArrayAndMap.xmclass;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
public class AmInvoker {

    @Autowired
    private List<BeanInterface> list;

    @Autowired
    private Map<String, BeanInterface> map;

    @Autowired
    @Qualifier("beanImplOne") //指定具体实现类
    private BeanInterface beanInterface;

    public void say(){
        if (list != null && list.size() != 0) {
            System.out.println("list: ");
            for (BeanInterface beanInterface : list) {
                System.out.println(beanInterface.getClass().getName());
            }
        }else {
            System.out.println("beaninterface is null!");
        }

        if (map != null && map.size() != 0) {
            System.out.println("map : ");
            for (Map.Entry<String, BeanInterface> beanInterfaceEntry : map.entrySet()) {
                System.out.println(beanInterfaceEntry.getKey() + "_____" + beanInterfaceEntry.getValue().getClass().getName());
            }
        }else {
            System.out.println("map is null!");
        }

        System.out.println("qualifier: ");
        if (beanInterface != null) {
            System.out.println(beanInterface.getClass().getName());
        }else {
            System.out.println("beaninterface is null!");
        }

    }
}
