package com.ajacom.cloud.feign.hystrix;

import com.ajacom.cloud.feign.service.SchedualServiceHi;
import org.springframework.stereotype.Component;

/**
 *
 * @author Administrator
 * @date 2018/1/10
 */
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+name;
    }
}
