package com.fei.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.exception.ZuulException;
import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;

/**
 * @author feixiaoteng
 * @create 2019-07-07 23:48
 */
public class RoutingFilter extends ZuulFilter {
    public String filterType() {
        return FilterConstants.ROUTE_TYPE;
    }
    public int filterOrder() {
        return 0;
    }
    public boolean shouldFilter() {
        return true;
    }
    public Object run() throws ZuulException {
        System.out.println("RoutingFilter...run()");
        return null;
    }
}