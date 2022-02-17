/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author rafakiwi
 */
public class Camion {
    
    public String nombre;
    public String placas;
    public String modelo; 
    public String marca;
    public String ejes;
    
    
    public Camion(String nombre,String placas, String modelo, String marca, String ejes){
        this.nombre = nombre;
        this.placas = placas;
        this.modelo = modelo;
        this.marca = marca;
        this.ejes = ejes;
    }
    
    public String getNom(){
        return nombre;
    }
    public String getModelo(){
        return modelo;
    }
}
