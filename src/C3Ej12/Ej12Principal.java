/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package C3Ej12;

/**
 *
 * @author Hector
 */
public class Ej12Principal {
   public static void main(String[]args){
       System.out.println("\nEjercicio 12");
Student sn=new Student(23,2,20);
        ShowStudent std = new ShowStudent(sn);
        System.out.println(std.getStud());


Student sn2 = new Student();
        ShowStudent2 std2=new ShowStudent2(sn2);
        System.out.println(std2.getShow2());

   } 
}
