/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InchesToFeet;

/**
 *
 * @author Hector
 */
public class InchesToFeet {
    private Integer inches;
    public Integer getInches(){
        return inches;
    }
    public void setInches(Integer valor){
        inches=valor;
    }
    public InchesToFeet(){
        inches=86;
    }
    public String convertir(){
        Integer feet=inches/12;
        Integer insobrante=inches%12;
        return String.format("tienes %d ft y %d in",feet,insobrante);
    }
}
