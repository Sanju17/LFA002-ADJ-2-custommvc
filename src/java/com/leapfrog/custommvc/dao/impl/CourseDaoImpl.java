/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.custommvc.dao.impl;

import com.leapfrog.custommvc.dao.CourseDAO;
import com.leapfrog.custommvc.db.DBConnection;
import com.leapfrog.custommvc.entity.Course;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author cSangharsha
 */
public class CourseDaoImpl implements CourseDAO {
    
    private DBConnection db = new DBConnection();
    
    // <editor-fold defaultstate="collapsed" desc="getAllCourse">
    @Override
    public List<Course> getAllCourse() throws SQLException, ClassNotFoundException{
        db.open();
        List<Course> courses = new ArrayList<>();
        ResultSet rs = db.executeQuery("SELECT * FROM courses");
        while(rs.next()){
            Course c = new Course();
            c.setId(rs.getInt("id"));
            c.setName(rs.getString("name"));
            c.setDescription(rs.getString("description"));
            c.setFees(rs.getInt("fees"));
            c.setStatus(rs.getBoolean("status"));
            courses.add(c);
        }
        db.close();
        return courses;
    }
    // </editor-fold>
    
}
