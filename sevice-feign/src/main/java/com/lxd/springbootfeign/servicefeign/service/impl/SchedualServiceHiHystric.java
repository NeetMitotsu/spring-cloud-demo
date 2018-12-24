package com.lxd.springbootfeign.servicefeign.service.impl;

import com.lxd.springbootfeign.servicefeign.service.SchedualServiceHi;
import org.springframework.stereotype.Component;

/**
 * @Author Administrator李新栋 [lxd3808@163.com]
 * @Date 2018/12/24 16:40
 */
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {
    @Override
    public String sayHiFromClientOne(String name) {
        return "Sorry " + name;
    }
}
