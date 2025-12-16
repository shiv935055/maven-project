package com.example;

import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/hello")
public class MyServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
            throws IOException {
        resp.getWriter().write("Hello from Maven + Jakarta EE 10 + WildFly 38!");
    }
}

