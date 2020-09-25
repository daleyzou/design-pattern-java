package com.daleyzou.design.action.chain.filter;

/**
 * DemoServlet
 * @description TODO
 * @author daleyzou
 * @date 2020年09月25日 15:42
 * @version 1.0.0
 */

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "DemoServlet", urlPatterns = "/demoServlet")
public class DemoServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("application/json;charset=utf-8");
        resp.getWriter().write("this is a demo test");
    }
}