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
public class NormalGatePass extends GatePass {
    private String comments = "Not set yet";
    
    
    public NormalGatePass(String name, int gradeLevel, int id, String comments, int passNumber, boolean setSenior) {
        super(name, gradeLevel, id, passNumber, setSenior);
        this.comments = comments;
    }
    
    public String getComments(){
        return comments;
    }
    
    public void setComments(String comments){
        this.comments = comments;
    }
    
}
