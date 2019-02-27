/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package C4Ej4;

/**
 *
 * @author Hector
 */
public class Ej4Principal {
   public static void main(String[]args){
       System.out.println("\nEjercicio 4");
        Paciente p=new Paciente(333,19, BloodType.A, Factor.POSITIVO);
        System.out.println(p.toString());

   } 
}
