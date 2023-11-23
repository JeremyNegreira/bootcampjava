package com.bootcampjava.c10_e1.servlets;

import com.bootcampjava.c10_e1.persistencia.VotosDAO;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ProcesarVoto")
public class VotarServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String partido = request.getParameter("partido");
        System.out.println(partido);
        VotosDAO.votar(partido);
        response.sendRedirect("index.jsp");
    }
}
