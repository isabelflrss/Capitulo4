/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rectangulo1;
import java.util.Scanner;
/**
 *
 * @author Hector
 */
public class RectanguloPrincipal {
    public static void main(String[]args){
        Scanner b1=new Scanner(System.in);
        Integer bs1;
        Integer hl1;
        System.out.print("Base: ");
        bs1=b1.nextInt();
        Scanner h1=new Scanner(System.in);
        System.out.print("Altura: ");
        hl1=h1.nextInt();
     Rectangulo1 r1=new Rectangulo1(bs1,hl1);
        System.out.print("\n Area: ");
        System.out.print(r1.area());
        System.out.print("\n Perimetro: ");
        System.out.print(r1.perimetro());
    } 
}