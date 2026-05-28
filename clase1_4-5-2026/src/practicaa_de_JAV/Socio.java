/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicaa_de_JAV;

/**
 *
 * @author brian

 */
public class Socio {
    
    String nombre;
    double cuotaBase;
    
    public Socio(String nombre , double cuotaBase){
    this.nombre = nombre;
    this.cuotaBase = cuotaBase;    
    }
    public double calcularPago(){
        return cuotaBase;
    }
    
}
