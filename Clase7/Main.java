package Clase7;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        /*
        Hacer un programa que permita al usuario ingresar 5 números y mostrarlos.
        */

        int[] numbers = new int[5];

        System.out.println("Ingresa por favor, 5 números");
        for(int i = 0; i<numbers.length ;i++){
            System.out.println("Ingresa por favor el número");
            int number= scanner.nextInt();
            numbers[i]= number;
        }

        System.out.println("los números ingresados son: ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }

        /*
        Después de realizar el ejercicio anterior, agregar que muestre el número mayor y el número menor.
        */
        int max = Arrays.stream(numbers).max().getAsInt();
        int min= Arrays.stream(numbers).min().getAsInt();


        System.out.println("el numero mas grande es "+max);
        System.out.println("el numero mas chico es "+min);

        /*
        Ahora, hay que mostrar el promedio. Para hacer esto se suman todos los números y se divide por 5,
        ya que el usuario agregó 5 números.
        */

        int sum = 0;
        for (int number : numbers) {
            sum+=number;
        }

        double average = sum/5;

        System.out.println("el promedio de los números que has ingresado es "+ average);


    }
}
