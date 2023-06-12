package Clase6;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);

        /*
        Arma un buscador de países con Google Maps.
        Primero, pidele al usuario que ingrese un país (Ej: Colombia).
        Después muestra en consola la concatenación de:
        “https://www.google.com/maps/search/” + pais
        Entonces, cuando hagas click en el link que aparece en consola, te abrirá esa ubicación.
        */

        String URLMAPS = "https://www.google.com/maps/search/";
        System.out.println("Por favor, ingresa un pais");
        String pais= lectura.nextLine();

        System.out.println(URLMAPS+pais);

        /*
        Arma un buscador de tweets para Twitter.com. Es bastante similar al anterior.
        Pídele al usuario que ingrese el nombre de una celebridad (de una sola palabra), por ejemplo: “Messi”.
        Después muestra en consola la concatenación de:
        “https://twitter.com/search?q=” + palabra
        */

        String URLCELEBRITIE = "https://twitter.com/search?q=";
        System.out.println("Por favor, ingresa el nombre de una celebridad");
        String celebridad= lectura.nextLine();

        System.out.println(URLCELEBRITIE+ celebridad);



        /*
        Arma un programa que permita llamar a una persona por Whatsapp. Es similar al anterior.
        Pídele al usuario que ingrese un número de telefono sin espacios, por ejemplo: 5493541539405
        Después muestra en consola la concatenación de:
        “https://api.whatsapp.com/send?phone=” + telefono
        */

        String URLWHATSAPP = "https://api.whatsapp.com/send?phone=";
        System.out.println("Por favor, ingresa un numero de whatsapp");
        String cel= lectura.nextLine();

        System.out.println(URLWHATSAPP + cel);


        /*
        Armar un programa que permita cargar 3 números y mostrar cual es el número promedio
         */
        System.out.println("Ahora calcularemos el promedio de 3  numeros que elijas");
        System.out.println("Por favor, ingresa un numero");
        int number1= lectura.nextInt();

        System.out.println("Por favor, ingresa un segundo numero");
        int number2= lectura.nextInt();

        System.out.println("Por favor, ingresa un tercer numero");
        int number3= lectura.nextInt();

        double average = (number1+number2+number3)/3;

        System.out.println("El numero promedio es de "+ average);



        /*
        Armar un programa que permita cargar 3 números y mostrar cual es el mayor y cual es el menor.
        * */

        System.out.println("Ahora cual numero es el menor y cual el mayor");
        System.out.println("Por favor, ingresa un numero");
        number1= lectura.nextInt();

        System.out.println("Por favor, ingresa un segundo numero");
        number2= lectura.nextInt();

        System.out.println("Por favor, ingresa un tercer numero");
        number3= lectura.nextInt();

        double[] numbers = {number1,number2,number3};
        double max = Arrays.stream(numbers).max().getAsDouble();
        double min= Arrays.stream(numbers).min().getAsDouble();

        System.out.println("El número más grande es: " + max+ " y el numero mas pequeño es "+ min);


    }
}
