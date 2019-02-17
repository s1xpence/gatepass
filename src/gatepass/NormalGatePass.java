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
    private String reason = "Not set yet";
    
    
    public NormalGatePass(String name, int gradeLevel, int id, String reason) {
        super(name, gradeLevel, id);
        this.reason = reason;
    }
    
    public String getReason(){
        return reason;
    }
    
    public void setReason(String reason){
        this.reason = reason;
    }
    
}
