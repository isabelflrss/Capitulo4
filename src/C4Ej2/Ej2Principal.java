/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package C4Ej2;

/**
 *
 * @author Hector
 */
public class Ej2Principal {
    public static void main(String[]args){
        System.out.println("\nEjercicio 2");
        Billing b=new Billing();
        System.out.println(b.computeBill(10));
        System.out.println(b.computeBill(10,2));
        System.out.println(b.computeBill(10,2,3));

    }
}
