
import java.util.Scanner;

public class CalculadoraMenu {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String continuar;

        do {
            System.out.println("CALCULADORA BÁSICA");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicación");
            System.out.println("4. División");
            System.out.print("Selecciona una opción: ");
            int opcion = entrada.nextInt();

            if (opcion >= 1 && opcion <= 4) {
                System.out.print("Ingresa el primer número: ");
                double numero1 = entrada.nextDouble();

                System.out.print("Ingresa el segundo número: ");
                double numero2 = entrada.nextDouble();

                switch (opcion) {
                    case 1:
                        System.out.println("Resultado: " + (numero1 + numero2));
                        break;
                    case 2:
                        System.out.println("Resultado: " + (numero1 - numero2));
                        break;
                    case 3:
                        System.out.println("Resultado: " + (numero1 * numero2));
                        break;
                    case 4:
                        if (numero2 != 0) {
                            System.out.println("Resultado: " + (numero1 / numero2));
                        } else {
                            System.out.println("Error: no se puede dividir entre cero.");
                        }
                        break;
                }
            } else {
                System.out.println("Opción no válida.");
            }

            System.out.print("¿Deseas realizar otra operación? (s/n): ");
            continuar = entrada.next();

        } while (continuar.equalsIgnoreCase("s"));

        System.out.println("Calculadora finalizada.");
        entrada.close();
    }
}

