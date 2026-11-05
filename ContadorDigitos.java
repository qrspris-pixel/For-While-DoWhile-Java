
import java.util.Scanner;

public class ContadorDigitos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingresa un número entero: ");
        long numero = entrada.nextLong();

        long temporal = numero;
        int digitos = 0;

        if (temporal == 0) {
            digitos = 1;
        } else {
            while (temporal != 0) {
                temporal = temporal / 10;
                digitos++;
            }
        }

        System.out.println("El número tiene " + digitos + " dígitos.");

        entrada.close();
    }
}
