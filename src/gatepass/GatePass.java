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
    // TODO: add funny error message: "Mr. Java I don't feel so good... SEGMENTATION FAULT"
    // TODO: GUI Class: make it so that the "senior gate pass" checkbox is only enabled conditionally
    //       (such as if the option "G12" for grade level has been selected, then enable checkbox to be ticked.
    //       Else, disable option for all other grades)
    // TODO: MENTION THAT I COLLABORATED ON PROJECT WITH GABE IN CRITERION C
    private String name = "not set yet";
    private int gradeLevel = -999;
    private int id = -123;
    // DateTime date = new DateTime();
    private int passNumber = -123;
    private boolean setSenior = false;
    //constructors
    public GatePass() {

    }

    public GatePass(String name, int gradeLevel, int id, int passNumber, boolean setSenior) {
        this.name = name;
        this.gradeLevel = gradeLevel;
        this.id = id;
        this.passNumber = passNumber;
        this.setSenior = setSenior;
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
    
    public int getPassNumber(){
        return passNumber;
    }
    /*
    public DateTime getDate () {
        return date;
    }
*/

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
    
    public void setPassNumber(int passNUmber){
        this.passNumber = passNumber;
    }
    
    public void setSenior(boolean setSenior){
        this.setSenior = setSenior;
                }
    /*
    public void setDate(DateTime date){
        this.date = date;
    }
*/

}