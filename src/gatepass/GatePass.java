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
public abstract class GatePass {
    private String name = "name not set yet";
    private int gradeLevel = -999;
    private int id = -123;
    private String comments = "not set yet"; 
    
    //constructors
    public GatePass() {

    }

    public GatePass(String name, int gradeLevel, int id, String comments) { 
        this.name = name;
        this.gradeLevel = gradeLevel;
        this.id = id;
        this.comments = comments; 
        
    }

    //accessor methods

    public int getGrade() {
        return gradeLevel;
    }
    
    public String getName() {
        return name;
    }
    
    public int getId() {
        return id;
    }
    
    public String getComments(){
        return comments;
    }

    //sets

    public void setName(String name){
        this.name = name;
    }
    
    public void setGrade(int gradeLevel){
        this.gradeLevel = gradeLevel;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    abstract int getPassNumber();

}