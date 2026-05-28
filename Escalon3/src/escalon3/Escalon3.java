
package escalon3;
/*
Tu objetivo en el Escalón 3:
Vas a crear un método que reciba un array de números decimales
que representan las notas de un grupo de alumnos.
El método tiene que encontrar y devolver cuál es la nota más baja de todas.

*/
public class Escalon3 {
    public static void main(String[] args) {
     double[] notasTodas = {7.5,10,8.5,6.8,3.5,9.5};
     double notaFinal = notaMenor(notasTodas);
     System.out.println(notaFinal);
    } 
    public static double notaMenor(double[] notas){
    double notaMenor = notas[0];
    double notaMayor = 0;
    for(int i = 1; i< notas.length ; i++){    
    notaMayor = notas[i];
        if(notaMenor > notaMayor){   
            notaMenor = notaMayor;
    } 
   
    }
       return notaMenor;  
    
    
}}
