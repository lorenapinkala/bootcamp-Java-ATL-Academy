package Clase5;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Ejercicio numero 1");

        /*Pídele al usuario que ingrese la edad de su perro.
        Convierte esa edad a años de perro (se dice que 1 año humano equivale a 7 años de perro).*/

        Scanner lectura = new Scanner(System.in);
        System.out.println("Por favor, ingresa la edad de tu perro");
        String edad= lectura.nextLine();

        int edadHumana= Integer.parseInt(edad) * 7;
        System.out.println("la edad de tu perro en años humanos es "+edadHumana);


        System.out.println("Ejercicio numero 2");

        /*
            Conversor de millas a kilómetros:
            Pídele al usuario que ingrese una distancia en millas.
            Convierte la distancia a kilómetros utilizando la fórmula: kilómetros = millas * 1.60934.
            Muestra la distancia en kilómetros al usuario.

        */
        System.out.println("Por favor, ingresa la distancia en millas que deseees convertir a kilometros");
        String millas= lectura.nextLine();
        double kilometros= Integer.parseInt(millas) * 1.60934;
        System.out.println("el resultado de millas a kilometros es de "+kilometros);



        System.out.println("Ejercicio numero 3");

        /*
            Calculadora de descuento:
            Pídele al usuario que ingrese el precio original de un producto.
            Pídele al usuario que ingrese el porcentaje de descuento.
            Calcula el precio final después de aplicar el descuento utilizando la fórmula:
            precioFinal = precioOriginal - (precioOriginal * descuento / 100).
            Muestra el precio final al usuario.

        */

        System.out.println("Por favor, ingresa el precio original de un producto");
        String precioProducto=lectura.nextLine();
        int precioOriginal = Integer.parseInt(precioProducto);
        System.out.println("Por favor, ingresa el porcentaje de descuento del producto ingresado");
        String porcentaje= lectura.nextLine();
        int descuento = Integer.parseInt(porcentaje);

        double precioFinal = precioOriginal - (precioOriginal * descuento / 100);

        System.out.println("el precio final del producto es "+precioFinal);


        System.out.println("Ejercicio numero 4");
        /*
         Calculadora de propinas:
         Pídele al usuario que ingrese el total de la cuenta en un restaurante.
         Pídele al usuario que ingrese el porcentaje de propina que desea dejar.
        Calcula el monto de la propina utilizando la fórmula: propina = totalCuenta * (porcentajePropina / 100)
        */

        System.out.println("Por favor, ingresa el total de la cuenta del restaurante");
        String cuenta=lectura.nextLine();
        int cuentaInt = Integer.parseInt(cuenta);

        System.out.println("Por favor, ingresa el porcentaje de propina que desees dar");
        String propina=lectura.nextLine();
        int propinaInt = Integer.parseInt(propina);

        double totalCuenta = cuentaInt + (cuentaInt * propinaInt / 100);

        System.out.println("la cuenta del restaurante es de con propina " + totalCuenta);


        System.out.println("Ejercicio numero 5");

        /*
            Juego de adivinar el número:
            Genera un número aleatorio entre 1 y 100. Pídele al usuario que adivine el número.
        */
        Random random = new Random();
        int numeroAleatorio = random.nextInt(100) + 1;
        //System.out.println("numeroAleatorio "+numeroAleatorio);

        Scanner usuarioRes = new Scanner(System.in);
        boolean status = false;

        while (!status) {
            System.out.println("Adivina el número:");
            int intento = usuarioRes.nextInt();

            if (intento == numeroAleatorio) {
                status = true;
                System.out.println("¡Adivinaste!");
            }else if(intento>100){
                System.out.println("no forma parte del rango, intenta con otro numero");
            }else if(intento<0){
                System.out.println("no forma parte del rango, intenta con otro numero");
            }

            else if (intento > numeroAleatorio) {
                System.out.println("Intenta con un número más pequeño.");
            } else if (intento < numeroAleatorio) {
                System.out.println("Intenta con un número más grande.");
            }
        }

        usuarioRes.close();

    }
}
