package Servlets;

import java.io.*;

import Daos.CancionDao;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "CancionServlet", value = "/CancionServlet")
public class CancionServlet extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        CancionDao cancionDao = new CancionDao();
        request.setAttribute("lista", cancionDao.listarCancion());

        RequestDispatcher view = request.getRequestDispatcher("cancion.jsp");
        view.forward(request,response);
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
