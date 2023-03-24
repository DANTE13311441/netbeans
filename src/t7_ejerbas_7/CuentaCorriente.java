/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t7_ejerbas_7;

/**
 *
 * @author tarde
 */
public class CuentaCorriente {
    double saldo;
    String nombre;
    String dni;
    double limite;
    Banco banco;
    
    CuentaCorriente (String nombre, String dni, Banco banco){
        saldo=0;
        this.nombre = nombre;
        this.dni=dni;
        limite=-50;
        this.banco=banco;
    }
    
    CuentaCorriente (String nombre, String dni){
        saldo=0;
        this.nombre=nombre;
        this.dni=dni;
        limite=-50;
    }
    void cambiarBanco(Banco banco){
        this.banco=banco;
    }
    boolean egreso(double cant){
        boolean operacionPosible;
        if((saldo-cant) >= limite){
            saldo -= cant;
            operacionPosible=true;
        } else {
            System.out.println("No hay dinero suficiente");
            operacionPosible=false;
        }
        return(operacionPosible);
    }
    void Ingreso (double cant){
        saldo += cant;
    }
    void mostrarInformacion(){
        System.out.println("INFORMACION DEL BANCO");
        if(banco==null){
            System.out.println("Cuenta no asociada");
        } else {
            banco.mostrarInformacion();
        }
        System.out.println("INFORMACION DE LA CUENTA");
        System.out.println("Nombre: " + nombre);
        System.out.println("DNI: " + dni);
        System.out.println("Saldo" + saldo);
        System.out.println("Limite descubierto: " + limite);
    }
}
