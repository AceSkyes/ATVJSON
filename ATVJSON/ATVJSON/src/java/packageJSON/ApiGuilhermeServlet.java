/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package packageJSON;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import org.json.JSONObject;
import org.json.JSONArray;
import java.util.Date;

/**
 *
 * @author Fatec
 */
@WebServlet(name = "ApiGuilhermeServlet", urlPatterns = {"/Guilherme.json"})
public class ApiGuilhermeServlet extends HttpServlet {
    private ArrayList<String> disciplinas = new ArrayList<>();
    

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("application/json;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            JSONObject obj = new JSONObject();
            JSONArray ar = new JSONArray();
            obj.put("Nome", "Guilherme Soares Brando");
            obj.put("RA", "1290482222015");
            disciplinas.add("ISO200-Sistemas Operacionais II");
            disciplinas.add("ILP007-Programação Orientada a Objetos");
            disciplinas.add("IBD002-Banco de Dados");
            disciplinas.add("IES300-Engenharia de Software III");
            disciplinas.add("AGO005-Gestão de Projetos");
            disciplinas.add("TTG001-Metodologia da Pesquisa Científico-Tecnológica");
            disciplinas.add("ILP512-Linguagem de Programação IV - INTERNET");
            for(String e: disciplinas){
                ar.put(e);
            }
            obj.put("disciplinas", ar);
            out.print(obj.toString());
            
            
            
            
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
