/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InchesToFeetInteractive.java;

/**
 *
 * @author Hector
 */
public class InchesToFeetInteractive {
    private Integer inches;
   private Integer u;
  public InchesToFeetInteractive(Integer u){
      inches=u;
  }
    public Integer getInches(){
        return inches;
    }
    public void setInches(){
        inches=u;
    }
    public String convertir(){
        return String.format("%d ft\n%d in",inches/12,inches%12);
    }
}
