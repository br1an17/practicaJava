/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicaa_de_JAV;

/**
 *
 * @author USUARIO
 */
 public class socioVip extends Socio {
    double bonoGimnasio;

    public socioVip(String nombre, double cuotaBase, double bonoGimnasio) {
        super(nombre, cuotaBase); 
        this.bonoGimnasio = bonoGimnasio;
    }

    @Override
    public double calcularPago() {
        return super.calcularPago() + this.bonoGimnasio;
    }
}

