import java.util.Scanner;
public class Swich {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa numero a: ");
        double a = sc.nextDouble();

        System.out.println(" Ingresa numero b: ");
        double b = sc.nextDouble();

        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multuplicar");
        System.out.println("4. Dividir");
        System.out.println("Escoje una opción: ");
        int opcion = sc.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("Resultado: "+ (a + b));
                break;
            case 2: 
                System.out.println("Resultado: "+ (a - b));
                break;
            case 3:
                System.out.println("Resultado: "+ (a * b));
                break;
            case 4: 
                System.out.println("Resultado: "+ (a / b));
                break;
            default:
                System.out.println("Opción invalida");
            
        }


    }
}
