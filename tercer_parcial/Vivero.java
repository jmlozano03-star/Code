package tercer_parcial;

import java.util.Scanner;

public class Vivero {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String [] productos = {"Captus","Suculenta","Maceta", "Tierra", "Fertilizante"};
        String [] semana = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado"};
        double [] precios = {45.5, 35.5, 60.0, 80.0, 65.0};
        double [][] almacenamiento = new double[6][5];

        for(int i = 0; i < semana.length; i++){
            System.out.println("\n" + semana[i]);

            for(int j = 0; j < productos.length; j++){
                System.out.println("Cuantos productos vendiste de "+ productos[j]);
                double cantidad = sc.nextDouble();

                almacenamiento[i][j] = precios[j] * cantidad;
    
        }
    }

    for(int i = 0; i < semana.length; i++){
        System.out.println("\nDia" + semana[i]);
        for(int j = 0; j < precios.length; j++){
            System.out.println("\n" + productos[j]);
            System.out.println("Total venta :" + almacenamiento[i][j]);
        }
    }
        



        sc.close();

    }
}
