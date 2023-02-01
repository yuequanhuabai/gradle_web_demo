package com.h;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

// 自动生成的Servlet， 需要将name改为urlPatterns；
// 2，需要将web.xml文件的metadata-complete的值改为false，如果是true，则注解形式的Servlet不生效。
//@WebServlet(name = "MyServlet", value = "/MyServlet")
@WebServlet(urlPatterns = "/MyServlet")
public class MyServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("do GET");
        int a =10;
        int b =20;
        a = a+b;
        System.out.println(a);
        System.out.println(b);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("do POST");
        int a =20;
        int b =40;
        a = a+b;
        System.out.println(a);
        System.out.println(b);
    }
}
