
import java.util.Scanner;

public class MediaPositivos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double suma = 0;
        int cantidad = 0;
        double numero = 0;

        System.out.println("Ingresa números positivos.");
        System.out.println("Para terminar, ingresa un número negativo.");

        while (numero >= 0) {
            System.out.print("Ingresa un número: ");
            numero = entrada.nextDouble();

            if (numero > 0) {
                suma = suma + numero;
                cantidad++;
            }
        }

        if (cantidad > 0) {
            double media = suma / cantidad;
            System.out.println("La media de los números positivos es: " + media);
        } else {
            System.out.println("No se ingresaron números positivos.");
        }

        entrada.close();
    }
}
