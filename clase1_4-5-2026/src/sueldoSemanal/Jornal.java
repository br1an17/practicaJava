package sueldoSemanal;
import java.util.Scanner;
/**
 *
 * @author Brian
 */
public class Jornal {
   final static Scanner input = new Scanner(System.in);
    
     public static void main(String[] args) {
        int cantidadHsTrabajadas;
        double valorHora, totalSemanal, totalDiasHabiles, totalSabado;

        System.out.println("Ingrese valor hora: ");
        valorHora = Double.parseDouble(input.nextLine()); // uso de wrappers (clases envolventes)

        System.out.println("Ingrese la cantidad de horas por dia habil: ");
        cantidadHsTrabajadas = Integer.parseInt(input.nextLine());

        // hacemos los calculos (regla de negocio mejorada en post del laburante)
        totalDiasHabiles = valorHora * cantidadHsTrabajadas * 5; // 10000
        totalSabado = (valorHora * cantidadHsTrabajadas / 2) * 1.5; // 5000
        totalSemanal = totalDiasHabiles + totalSabado;

        System.out.println("Total valor semanal $: " + totalSemanal);
        input.close();
    }
}
