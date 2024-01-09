/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author juan1
 */
public class Productes {
    private final String nom;
    private final float  precio;
    private final String descripcion;
    
    public Productes (String nom, float Precio, String Descripcio){
         this.nom = nom;
         this.precio = Precio;
         this.descripcion = Descripcio;
    }
    
    public void Lista(){
    System.out.println("Hola, le producto: "+nom+" ,cuesta "+precio+"€"+" y es: "+descripcion );
}
}
