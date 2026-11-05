
import java.util.Scanner;

public class SecuenciaCuadrados {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingresa un número entero positivo: ");
        int numero = entrada.nextInt();

        if (numero > 0) {
            int contador = 1;

            System.out.println("Cuadrados de los números del 1 al " + numero + ":");

            do {
                long cuadrado = (long) contador * contador;
                System.out.println(contador + " al cuadrado = " + cuadrado);
                contador++;
            } while (contador <= numero);

        } else {
            System.out.println("Error: debes ingresar un número mayor que cero.");
        }

        entrada.close();
    }
}
