
package Escalon1;
//Escribí un método en Java llamado filtrarPrecios que reciba
//un array de enteros (int[] precios)
// y devuelva la suma de todos los precios que sean mayores a 100 y que además sean números pares.
//Ejemplo: Si te pasan [50, 120, 150, 300, 85], 
//el resultado debe ser 420 (porque 120 y 300 cumplen ambas condiciones, pero 150 es impar).
public class Escalon1 {

    public static void main(String[] args) {
        
        int[] datosDePrueba = {50, 120, 150, 300, 85};
        int resultado = filtrarPrecios(datosDePrueba);
        System.out.println("El resultado de la suma es: " + resultado);
        
    }
    
    public static int filtrarPrecios(int[] precios){
    
        int suma = 0;   
        for (int precio : precios) {
            if(precio > 100 &&  (precio % 2) == 0)
                suma += precio;          
        }
                return suma;

    }
   
}
