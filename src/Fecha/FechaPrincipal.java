/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fecha;

import java.util.Scanner;

/**
 *
 * @author Hector
 */
public class FechaPrincipal {
   public static void main(String[]args){
      Scanner dia= new Scanner(System.in);
      System.out.print("Día: \n");
      Integer numD;
      numD=dia.nextInt();
      Scanner mes= new Scanner(System.in);
      System.out.print("Mes: \n");
      Integer numM;
      numM=mes.nextInt();
      Scanner anio= new Scanner(System.in);
      System.out.print("Año: \n");
      Integer numA;
      numA=anio.nextInt();
      Fecha x= new Fecha(numD,numM,numA);
      System.out.print(x.agregarDia());
      System.out.print(x.diasMes());
   } 
}
