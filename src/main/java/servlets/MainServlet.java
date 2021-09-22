package servlets;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "MainServlet", urlPatterns = "/main-servlet")
public class MainServlet extends HttpServlet {

    Map<Integer, String> db;
    public void init() {
        db = new HashMap<Integer, String>();
    }


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // getServletContext().getRequestDispatcher("/login.jsp").forward(request, response);
        response.setContentType("text/html");
        Integer id = Integer.parseInt(request.getParameter("id"));
        if (db.containsKey(id)){
            response.getWriter().print("<h1>Welcome " + db.get(id) +"</h1>");
            response.getWriter().println("<p>Your id is " + id + "</p>");
        }
        else{
            response.getWriter().println("<h1>Error, this id is not exist</h1>");
        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");


        String name = request.getParameter("username");
        Integer id = Integer.parseInt(request.getParameter("id"));

        if(db.containsKey(id)){
            response.getWriter().println("Error, this id already exist");
        }
        else {
            db.put(id, name);
            response.getWriter().println("<h1>Hello "+ name + "</h1>");
            response.getWriter().println("<p>Your id is " + id + "</p>");
        }
    }
    public void destroy(){}
}
