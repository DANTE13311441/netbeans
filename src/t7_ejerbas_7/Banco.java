/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t7_ejerbas_7;

/**
 *
 * @author tarde
 */
public class Banco {
    final private String nombre;
    public double capital = 5.2;
    public String direccion = "Sin direccion";
    public Banco(String nombre){
        this.nombre = nombre;
    }
    
    public Banco(String nombre, double capital, String direccion){
        this.nombre = nombre;
        this.capital = capital;
        this.direccion = direccion;
    }
    public void mostrarInformacion(){
        System.out.println("Banco: " + nombre);
        System.out.println("Capital: " + capital + "millones de euros");
        System.out.println("Direccion: " + direccion);
        System.out.println("");
    }
}




