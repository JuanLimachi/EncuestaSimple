package com.emergentes;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "ProcesaServlet", urlPatterns = {"/ProcesaServlet"})
public class ProcesaServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String nombre = request.getParameter("nombre");
        String lenguajes[] = request.getParameterValues("lenguajes");
        
        //Crear un objeto para encapsular la informacion
        Encuesta enc = new Encuesta();
        
        //Llenar datos en el objeto enc
        enc.setNombre(nombre);
        enc.setLenguajes(lenguajes);
        
        //Colocamos el objeto enc como atributo de request
        request.setAttribute("enc", enc);
        
        //Enviar el objeto request a salida.jsp
        request.getRequestDispatcher("salida.jsp").forward(request, response);
        
    }

}
