/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InchesToFeetInteractive.java;
import java.util.Scanner;
/**
 *
 * @author Hector
 */
public class InteractivePrincipal {
    
    public static void main(String[]args){
        Scanner entrada= new Scanner(System.in);
        System.out.print("Inches . . .\n");
        Integer num1;
        num1=entrada.nextInt();
        InchesToFeetInteractive x =new InchesToFeetInteractive(num1);
        System.out.print(x.convertir());
    }
}
