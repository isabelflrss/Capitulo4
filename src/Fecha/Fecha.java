/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fecha;

/**
 *
 * @author Hector
 */
public class Fecha {
    private Integer dia;
    private Integer mes;
    private Integer anio;
    public Fecha(Integer dia,Integer mes,Integer anio){
        this.dia=dia;
        this.mes=mes;
        this.anio=anio;
    }
    public void setDia(Integer dia){
        this.dia=dia;
    }
    public void setMes(Integer mes){
        this.mes=mes;
    }
    public void setAnio(Integer anio){
        this.anio=anio;
    }
    public Integer getDia(){
        return this.dia;
    }
    public Integer getMes(){
        return this.mes;
    }
    public Integer getAnio(){
        return this.anio;
    }
   public Integer diasMes(){
       switch(this.mes){
           case 1:case 3:case 5:case 7:case 8:case 10:case 12: return 31;
           case 4:case 6:case 9:case 11: return 30;
           case 2:
               if (this.anio%4==0){
                   return 29;
               } else{
                   return 28;
               }
       }
        return this.mes;
   }
   public String agregarDia(){
       dia++;
       if(dia>this.diasMes()){
           dia=1;
           mes++;
           if (mes>12){
               mes=1;
               anio++;
           }
           
       }  
       return String.format("Nueva fecha: %d /%d/ %d\n",dia,mes,anio);
   }
}
