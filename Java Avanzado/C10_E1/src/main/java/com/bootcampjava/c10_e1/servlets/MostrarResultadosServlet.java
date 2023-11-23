package com.bootcampjava.c10_e1.servlets;

import com.bootcampjava.c10_e1.persistencia.VotosDAO;
import java.io.IOException;
import java.sql.ResultSet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author jerem
 */
@WebServlet("/MostrarResultados")
public class MostrarResultadosServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ResultSet resultados = VotosDAO.obtenerResultados();
        request.setAttribute("resultados", resultados);
        RequestDispatcher dispatcher = request.getRequestDispatcher("resultados.jsp");
        dispatcher.forward(request, response);
    }
}
