/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package escalon2;

/**
 *
 * @author Brian EJERCICIO El objetivo es contar cuántos usuarios tienen un
 * nombre válido. Recordemos las reglas para que un nombre sea válido: No tiene
 * que estar vacío. Tiene que empezar con la letra "A" (ya sea mayúscula o
 * minúscula).
 */
public class Escalon2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String[] nombresDePrueba = {"Andres", "ana", "Pedro", "", "Alejandro", "Carlos"};
        
        int resultado = nombreValido(nombresDePrueba);
        
        System.out.println("la cantidad de nombres validos es de " + resultado);
        
        
    }

    public static int nombreValido(String[] usuarios) {

        int contador = 0;

        for (String usuario : usuarios) {

            if(usuario != ""){
            String nombreMinuscula = usuario.toLowerCase();

            char letra = nombreMinuscula.charAt(0);
            
            if (letra == 'a'){
           contador++;
            }

        }}

        return contador;
    }
;

}
