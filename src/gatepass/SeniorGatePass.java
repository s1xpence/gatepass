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
public class SeniorGatePass extends GatePass {
    private int passNumber = -1;
    boolean isSenior = true;
    
    
    public SeniorGatePass(String name, int gradeLevel, int id, String comments, int passNumber, boolean setSenior) {
        super(name, gradeLevel, id, comments);
        this.passNumber = passNumber;
    }
    
    @Override
    public int getPassNumber(){
        return passNumber;
    }
    
    public void setPassNumber(int passNumber){
        this.passNumber = passNumber;
    }
    
    public boolean getIsSenior(){
        return isSenior;
    }
    
}
