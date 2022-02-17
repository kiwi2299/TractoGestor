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
public class Chofer {
    public String nombre;
    public String telefono;
    public String email;
    public String licencia;
    
    public Chofer(String nom, String tel, String mail, String lic){
        nombre = nom;
        telefono = tel;
        email = mail;
        licencia = lic;
    }
    
    public String getNom()
    {
     return nombre;   
    }
}
