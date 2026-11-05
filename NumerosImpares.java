
import java.util.Scanner;

public class NumerosImpares {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingresa un número entero positivo: ");
        int numero = entrada.nextInt();

        if (numero > 0) {
            int contador = 1;

            System.out.println("Números impares del 1 al " + numero + ":");

            do {
                if (contador % 2 != 0) {
                    System.out.println(contador);
                }
                contador++;
            } while (contador <= numero);

        } else {
            System.out.println("Error: debes ingresar un número mayor que cero.");
        }

        entrada.close();
    }
}
