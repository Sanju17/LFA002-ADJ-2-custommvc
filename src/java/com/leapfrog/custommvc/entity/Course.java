/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.custommvc.entity;

/**
 *
 * @author cSangharsha
 */
public class Course {

    private int id;
    private String name;
    private String description;
    private int fees; 
    private boolean status;  

    // <editor-fold defaultstate="collapsed" desc="Default Constructor">
    public Course() {
    }
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Parameterized Constructor">
    public Course(int id, String name, String description, int fees, boolean status) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.fees = fees;
        this.status = status;
    }
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="getId">
    public int getId() {
        return id;
    }
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="setId">
    public void setId(int id) {
        this.id = id;
    }
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="getName">
    public String getName() {
        return name;
    }
// </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="setName">
    public void setName(String name) {
        this.name = name;
    }
// </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="getDescription">
    public String getDescription() {
        return description;
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="setDescription">
    public void setDescription(String description) {
        this.description = description;
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="getFees">
    public int getFees() {
        return fees;
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="setFees">
    public void setFees(int fees) {
        this.fees = fees;
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="isStatus">
    public boolean isStatus() {
        return status;
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="setStatus">
    public void setStatus(boolean status) {
        this.status = status;
    }
    // </editor-fold>
}
