/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gatepass;

/**
 *
 * @author 14367
 */
public class GatePass {

    private String name = "not set yet";
    private int gradeLevel = -999;
    private int id = -123;
    //constructors
    public GatePass() {

    }

    public GatePass(String name, int gradeLevel, int id) {
        this.name = name;
        this.gradeLevel = gradeLevel;
        this.id = id;
    }

    //accessor methods
    /*
    public String getName() {
        return name;
    }
    */

    public int getGrade() {
        return gradeLevel;
    }
    
    public String getName() {
        return name;
    }
    
    public int getId() {
        return id;
    }

    //sets

    public void setName(String name) {
        this.name = name;
    }
    
    public void setGrade(int gradeLevel) {
        this.gradeLevel = gradeLevel;
    }
    
    public void setId( int id) {
        this.id = id;
    }

}