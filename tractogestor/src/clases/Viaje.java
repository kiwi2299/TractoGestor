/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.text.ParseException;


/**
 *
 * @author rafakiwi
 */
public class Viaje {
    public String ID;
    public String fecha;
    public String destino;
    public String solicitante;
    public String chofer;
    public String unidad;
    
    public Viaje(String id,String fecha, String destino, String sol,String chofer, String camion){
        ID = id;
        this.fecha = fecha;
        this.destino = destino;
        solicitante = sol;
        this.chofer = chofer;
        unidad = camion;
    }
    
   public void aperturaViaje() throws ParseException{
         
        System.out.println(fecha);
   }
   
   public String getId(){
       return ID;
   }
   public String getFecha(){
       return fecha;
   }
   public String getDestino(){
       return destino;
   }
   public String getSoli(){
       return solicitante;
   }
    public String getChofer(){
       return chofer;
   }
     public String getCamion(){
       return unidad;
   }
}


