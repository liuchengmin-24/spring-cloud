package com.ajacom.cloud.sleuth.gateway.filter;

import com.netflix.zuul.ZuulFilter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;
import org.springframework.cloud.sleuth.Tracer;
import org.springframework.stereotype.Component;

/**
 *
 * @author Administrator
 * @date 2018/1/11
 */
@Component
@Slf4j
public class LoggerFilter extends ZuulFilter {
    @Autowired
    Tracer tracer;
    @Override
    public String filterType() {
        return FilterConstants.POST_TYPE;
    }

    @Override
    public int filterOrder() {
        return 900;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() {
        tracer.addTag("operator","ajacom");
        log.info("traceId:"+tracer.getCurrentSpan().traceIdString());
        return null;
    }
}
