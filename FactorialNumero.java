
import java.util.Scanner;

public class FactorialNumero {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingresa un número entero: ");
        int numero = entrada.nextInt();

        long factorial = 1;

        if (numero < 0 || numero > 20) {
            System.out.println("Ingresa un número entre 0 y 20.");
        } else {
            for (int i = 1; i <= numero; i++) {
                factorial = factorial * i;
            }

            System.out.println("El factorial de " + numero + " es: " + factorial);
        }

        entrada.close();
    }
}

