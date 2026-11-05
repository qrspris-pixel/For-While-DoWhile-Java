
import java.util.Scanner;

public class ConteoNumeros {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("¿Cuántos números deseas ingresar? ");
        int cantidad = entrada.nextInt();

        int positivos = 0;
        int negativos = 0;
        int ceros = 0;

        if (cantidad <= 0) {
            System.out.println("La cantidad debe ser mayor que cero.");
        } else {
            for (int i = 1; i <= cantidad; i++) {
                System.out.print("Ingresa el número " + i + ": ");
                double numero = entrada.nextDouble();

                if (numero > 0) {
                    positivos++;
                } else if (numero < 0) {
                    negativos++;
                } else {
                    ceros++;
                }
            }

            System.out.println("Números mayores que cero: " + positivos);
            System.out.println("Números menores que cero: " + negativos);
            System.out.println("Números iguales a cero: " + ceros);
        }

        entrada.close();
    }
}
