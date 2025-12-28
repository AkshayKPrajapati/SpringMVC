package com.example.interceptor;

import java.io.PrintWriter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.HandlerInterceptor;

public class MyInterceptor implements HandlerInterceptor {

    public boolean preHandle(HttpServletRequest request,
                             HttpServletResponse response,
                             Object handler) throws Exception {

        System.out.println("This is preHandle");

        String role = request.getParameter("role");

        if ("admin".equals(role)) {   // ✅ null-safe check
            System.out.println("Authorized role: " + role);
            return true;             // Continue request
        } else {
            response.setContentType("text/html");
            PrintWriter pw = response.getWriter();
            pw.println("<h2>Not authorized for this handler</h2>");
            return false;            // ❌ STOP request here
        }
    }
}
 