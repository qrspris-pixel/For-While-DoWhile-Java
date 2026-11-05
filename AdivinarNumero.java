
import java.util.Scanner;
import java.util.Random;

public class AdivinarNumero {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Random aleatorio = new Random();

        int numeroSecreto = aleatorio.nextInt(100) + 1;
        int intento = 0;
        int cantidadIntentos = 0;

        System.out.println("Adivina el número entre 1 y 100.");

        while (intento != numeroSecreto) {
            System.out.print("Ingresa un número: ");
            intento = entrada.nextInt();
            cantidadIntentos++;

            if (intento > numeroSecreto) {
                System.out.println("Demasiado alto. Intenta otra vez.");
            } else if (intento < numeroSecreto) {
                System.out.println("Demasiado bajo. Intenta otra vez.");
            } else {
                System.out.println("¡Correcto! Adivinaste el número.");
                System.out.println("Número de intentos: " + cantidadIntentos);
            }
        }

        entrada.close();
    }
}
