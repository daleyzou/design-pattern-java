package com.daleyzou.design.action.chain.filter;

/**
 * DemoFilter
 * @description TODO
 * @author daleyzou
 * @date 2020年09月25日 15:43
 * @version 1.0.0
 */


import org.springframework.util.StringUtils;

import javax.servlet.*;
import java.io.IOException;
import java.util.Objects;

public class DemoFilter implements Filter {
    private FilterConfig filterConfig;

    private String forbidIds;

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        this.filterConfig = filterConfig;
        //获取初始化参数
        forbidIds = filterConfig.getInitParameter("forbidIds");
        System.out.println("forbidIds:" + forbidIds);
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

        String id = request.getParameter("id");
        if (StringUtils.isEmpty(forbidIds) || !forbidIds.contains(Objects.toString(id, "001"))) {
            //不拦截，调用后续访问
            chain.doFilter(request, response);
        } else {
            //拦截，输出错误信息
            response.setContentType("application/json;charset=utf-8");
            response.getWriter().write("forbid");
        }
    }

    @Override
    public void destroy() {
        System.out.println("DemoFilter destroy");
    }
}
