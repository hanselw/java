package com.han.servicefeign;

import org.springframework.stereotype.Component;

/**
 * @authot hansel
 * @date 2018/03/08 18:06
 */

@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {

    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+name+" from feign!";
    }
}
