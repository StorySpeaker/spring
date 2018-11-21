package com.ArrayAndMap.xmclass;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
public class AmInvoker {

    @Autowired
    private List<BeanInterface> list;

    @Autowired
    private Map<String, BeanInterface> map;

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

    }
}
