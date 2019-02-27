/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package C4Ej7;

/**
 *
 * @author Hector
 */
public class Ej7Principal {
    public static void main(String[]args){
        System.out.println("\nEjercicio7");
MathTest mat = new MathTest();
        System.out.println("Inciso a)");
        System.out.println(mat.a((double)37));
        System.out.println("Inciso b)");
        System.out.println(mat.b((double)300));
        System.out.println("Inciso c)");
        System.out.println(mat.cy((double)22.8));
        System.out.println("Inciso d)");
        System.out.println(mat.d('D', 71));
        System.out.println("Inciso e)");
        System.out.println(mat.e());

    }
}
