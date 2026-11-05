
import java.util.Scanner;

public class SecuenciaAritmetica {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingresa el primer número: ");
        int inicio = entrada.nextInt();

        System.out.print("Ingresa la diferencia: ");
        int diferencia = entrada.nextInt();

        System.out.print("Ingresa el número máximo: ");
        int maximo = entrada.nextInt();

        if (diferencia > 0 && inicio <= maximo) {
            long numero = inicio;

            System.out.println("Secuencia aritmética:");

            do {
                System.out.println(numero);
                numero = numero + diferencia;
            } while (numero <= maximo);

        } else {
            System.out.println("Error: la diferencia debe ser positiva y el inicio no debe superar el máximo.");
        }

        entrada.close();
    }
}
