/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.custommvc.dao;

import com.leapfrog.custommvc.entity.Course;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author cSangharsha
 */
public interface CourseDAO {
    List<Course> getAllCourse() throws SQLException, ClassNotFoundException; 
}
