
import java.util.Scanner;

public class ContarLetraA {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingresa una palabra: ");
        String palabra = entrada.nextLine().toLowerCase();

        int contador = 0;

        for (int i = 0; i < palabra.length(); i++) {
            if (palabra.charAt(i) == 'a') {
                contador++;
            }
        }

        System.out.println("La letra a aparece " + contador + " veces.");

        entrada.close();
    }
}
