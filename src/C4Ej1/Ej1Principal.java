/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package C4Ej1;

/**
 *
 * @author Hector
 */
public class Ej1Principal {
    public static void main(String[]args){
        System.out.println("\nEjercicio1");
FormLetterWriter fw = new FormLetterWriter();
        System.out.println(fw.displaySalutation("Sosa"));
        System.out.println(fw.displaySalutation("Sosa","Miguel"));

    }
}
