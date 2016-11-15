/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.custommvc.servlet;

import com.leapfrog.custommvc.dao.CourseDAO;
import com.leapfrog.custommvc.dao.impl.CourseDaoImpl;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author cSangharsha
 */
public class DefaultServlet extends HttpServlet {
    
    private String PATH = "/WEB-INF/views/"; 
    private CourseDAO courseDAO = new CourseDaoImpl();
    
    // <editor-fold defaultstate="collapsed" desc="GET Request">
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            request.setAttribute("courses", courseDAO.getAllCourse());
            request.getRequestDispatcher(PATH + "index.jsp").forward(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(DefaultServlet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DefaultServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    // </editor-fold>
    
}
