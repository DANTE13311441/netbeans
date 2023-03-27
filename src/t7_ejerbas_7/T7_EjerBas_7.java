/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t7_ejerbas_7;

/**
 *
 * @author tarde
 */
public class T7_EjerBas_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CuentaCorriente c1, c2, c3;
        Banco b1, b2;
            System.out.println("hvieu");
        b1 = new Banco("International Java Bank");
        b2 = new Banco("Caja de ahorros Do-While", 10.6, "c/Larga s/n");
        
        c1 = new CuentaCorriente("Pepita", "12345678-A", b1);
        c2 = new CuentaCorriente("Ana", "98765432-Z", b1);
        c1.mostrarInformacion();
        c2.mostrarInformacion();
        
        c3 = new CuentaCorriente("Sancho", "11222333-B");
        c3.mostrarInformacion();
        c3.cambiarBanco(b2);
        c3.mostrarInformacion();
    }
    
}
