package com.birdsh.chen.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @ClassName: MyServlet1.java 
 * @Description:在SpringBoot中使用servlet通过代码注册Servlet示例代码：
 * @author chenhuihui
 * @time 2017年9月20日下午2:21:10
 */

//这个不需要添加.
//@WebServlet(urlPatterns="/myServlet1/*", description="Servlet的说明")
public class MyServlet1 extends HttpServlet {

	private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println(">>>>>>>>>>doGet()<<<<<<<<<<<");
        doPost(req, resp);
    }


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println(">>>>>>>>>>doPost()<<<<<<<<<<<");
        resp.setContentType("text/html"); 
        resp.setCharacterEncoding("UTF-8");
        PrintWriter out = resp.getWriter(); 
        out.println("<html>"); 
        out.println("<head>"); 
        out.println("<title>Hello World</title>"); 
        out.println("</head>"); 
        out.println("<body>"); 
        out.println("<h1>这是：MyServlet1</h1>"); 
        out.println("</body>"); 
        out.println("</html>");
    }
}
