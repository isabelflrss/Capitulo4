/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package C4Ej5;

/**
 *
 * @author Hector
 */
public class Ej5Principal {
    public static void main(String[]args){
        System.out.println("\nEjercicio5");
Bread bre1 = new Bread("Maiz",23.5f);
        Bread bre2 = new Bread("trigo",13.5f);
        Bread bre3 = new Bread("centeno",(43.5f));
        System.out.println(bre1);
        System.out.println(bre2);
        System.out.println(bre3);
        Sandwich sandw1 = new Sandwich(bre1,sand); 
        Sandwich sandw2 = new Sandwich(bre2,sand2);
        Sandwich sandw3 = new Sandwich(bre3,sand3);
        System.out.println(sandw1.values());
        System.out.println(sandw2.values());
        System.out.println(sandw3.values());

    }
}
