import java.util.Scanner;
public class Operador_logicos {
    public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    System.out.println("Ingresa tu edad: ");
    int edad = sc.nextInt();

    System.out.println("Tienes identificación (true/false): ");
    boolean identificacion = sc.nextBoolean();

    if (edad >= 18 && identificacion) {
        System.out.println("Puedes pasar el gimansi");
    }else{
        System.out.println("No puedes psar al gimnasio");
    }
    sc.close();
    }
}

