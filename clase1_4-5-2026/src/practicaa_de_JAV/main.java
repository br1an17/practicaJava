/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicaa_de_JAV;

/**
 *
 * @author USUARIO
 */
public class main {
    public static void main(String[] args) {
        Socio socio1 = new Socio("Juan Perez", 2000);
        
        socioVip socio2= new socioVip( "Brian",2000,1500);
       
        System.out.println("Deve abonar: " + socio1.calcularPago());
        System.out.println("Deve abonar: " + socio2.calcularPago());
        
    }
        
    
    
}
