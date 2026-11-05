
import java.util.Scanner;

public class VocalesConsonantes {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingresa una letra por vez.");
        System.out.println("Para terminar, escribe un espacio y presiona Enter.");

        String texto = "";

        while (!texto.equals(" ")) {
            System.out.print("Ingresa una letra: ");
            texto = entrada.nextLine().toLowerCase();

            if (texto.equals(" ")) {
                System.out.println("Programa terminado.");
            } else if (texto.length() != 1) {
                System.out.println("Ingresa solamente una letra.");
            } else {
                char letra = texto.charAt(0);

                if ("aeiouáéíóú".indexOf(letra) >= 0) {
                    System.out.println("Es una vocal.");
                } else if (Character.isLetter(letra)) {
                    System.out.println("Es una consonante.");
                } else {
                    System.out.println("El carácter ingresado no es una letra.");
                }
            }
        }

        entrada.close();
    }
}
