
import java.util.ArrayList;
import java.util.Scanner;

public class ejercicio {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();

        // 1. Leer los 10 números
        for (int i = 0; i < 10; i++) {
            System.out.print("Ingresa el numero " + (i + 1) + ": ");
            int numero = Integer.parseInt(sc.nextLine());
            numeros.add(numero);
        }

        // 2. Suponer que el primer número es el mayor y el menor
        int mayor = numeros.get(0);
        int menor = numeros.get(0);

        int posicionMayor = 0;
        int posicionMenor = 0;

        // 3. Recorrer la lista para encontrar el mayor y el menor
        for (int i = 1; i < numeros.size(); i++) {

            if (numeros.get(i) > mayor) {
                mayor = numeros.get(i);
                posicionMayor = i;
            }

            if (numeros.get(i) < menor) {
                menor = numeros.get(i);
                posicionMenor = i;
            }
        }

        // 4. Mostrar los resultados
        System.out.println("\n--- RESULTADOS ---");
        System.out.println("Numero mayor: " + mayor);
        System.out.println("Posicion del mayor: " + (posicionMayor + 1));
        System.out.println("Numero menor: " + menor);
        System.out.println("Posicion del menor: " + (posicionMenor + 1));

        sc.close();
    }
}
