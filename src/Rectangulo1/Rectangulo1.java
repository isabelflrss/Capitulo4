/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rectangulo1;

/**
 *
 * @author Hector
 */
public class Rectangulo1 {
    
    public Integer base;
    public Integer altura;
    public Rectangulo1(Integer b,Integer h){
        base=b;
        altura=h;
    }
    public Integer perimetro(){
        return 2*(base+altura);
    }
    public Integer area(){
        return base*altura;
    }
}
