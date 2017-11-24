/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import data.DesignMapper;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import logic.Design;

/**
 *
 * @author Jonas
 */
@WebServlet(name = "DesignServelt", urlPatterns = {"/DesignServelt"})
public class DesignServelt extends HttpServlet {
DesignMapper dm = new DesignMapper();
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
            throws ServletException, IOException, SQLException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
          double length = Double.parseDouble(request.getParameter("length")) ;
         double width = Double.parseDouble(request.getParameter("width")) ;
        double height = Double.parseDouble(request.getParameter("height")) ;
        String desingname = request.getParameter("desingname");
        int userid = Integer.parseInt(request.getParameter("userid"));
 
   

        //request.getRequestDispatcher("designdetails.jsp").forward(request, response);
       
        Design design = dm.getDesignbyuserid(userid);
        if(design == null){
              dm.creatNewDesign(length, width, height, desingname, userid);
        } else{
              request.getSession().setAttribute("length", design.getLength());
            request.getSession().setAttribute("height", design.getHeight());
             request.getSession().setAttribute("width", design.getWidth());
              request.getSession().setAttribute("desingname", design.getName());
              request.getSession().setAttribute("userid", design.getUser_id());
              request.getRequestDispatcher("designdetails.jsp").forward(request, response);
               
        }
        
        
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
    try {
        processRequest(request, response);
    } catch (SQLException ex) {
        Logger.getLogger(DesignServelt.class.getName()).log(Level.SEVERE, null, ex);
    }
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
    try {
        processRequest(request, response);
    } catch (SQLException ex) {
        Logger.getLogger(DesignServelt.class.getName()).log(Level.SEVERE, null, ex);
    }
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
