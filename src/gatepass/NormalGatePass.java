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
    private boolean isSenior = false;    
    
    public NormalGatePass(String name, int gradeLevel, int id, String comments) {
        super(name, gradeLevel, id, comments);
    }
    
    public boolean getIsSenior(){
        return isSenior;
    }
    
    public int getPassNumber(){
        return -999;
    }
   
    
}
