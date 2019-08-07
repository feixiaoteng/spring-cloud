package com.fei.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;
import org.springframework.util.StringUtils;

import javax.servlet.http.HttpServletRequest;

/**
 * @author feixiaoteng
 * @create 2019-07-07 23:45
 */
public class ErrorFilter extends ZuulFilter {
    //过滤器的类型，它决定过滤器在请求的哪个生命周期中执行,使用FilterConstants常量类的以_TYPE结尾的常量
    public String filterType() {
        return FilterConstants.ERROR_TYPE;
    }
    //过滤器的执行顺序。当请求在一个阶段中存在多个过滤器时，需要根据该方法返回的值来依次执行。通过数字指定，数字越大，优先级越低
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }
    //过滤器的具体逻辑。这里我们通过ctx.setSendZuulResponse(false)令Zuul过滤该请求,不对其进行路由,然后通过ctx.setResponseStatusCode(401)设置了其返回的错误码，
    //当然我们也可以进一步优化我们的返回，比如，通过ctx.setResponseBody(body)对返回 body 内容进行编辑等
    public Object run() throws ZuulException {
        System.out.println("ErrorFilter...run()");
        return null;
    }
}
