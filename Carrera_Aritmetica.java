import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random; 
public class Carrera_Aritmetica {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         Random aleatorio = new Random(); 
        
         //pedir datos 
        System.out.println(" ¿Qué día naciste? ");
        float entrada = sc.nextInt();

        System.out.println( "¿Cuál es tu mes de nacimiento");
        int mes = sc.nextInt();

        //Arreglo para almacenar numeros aleatorios 
        int[] numeroRamdom = new int[5]; 
       
        int sumaNumerosRandom = 0;

        //Numero aleatorio
        for(int i = 0; i < 5; i++){
            int numero = aleatorio.nextInt(100) + 1; 
            numeroRamdom[i] = numero;
            
            sumaNumerosRandom = sumaNumerosRandom + numeroRamdom[i];
        }
        //Promedio numeros random 
        float promedio = sumaNumerosRandom / 5.0f; 

        //Sumatoria de promedio y numero de entrada
        float salida = promedio + entrada; 

        System.out.println( numeroRamdom[0]);
        System.out.println( numeroRamdom[1]);
        System.out.println( numeroRamdom[2]);
        System.out.println( numeroRamdom[3]);
        System.out.println( numeroRamdom[4]);
        System.out.println("Salida de ETAPA 1: " + salida);

        //ETAPA 2 
        float residuo = salida % 7; 

        salida = entrada + residuo; 
        
        System.out.println(" Salida de ETAPA 2: " + salida); 
        //ETAPA 3

        entrada = salida; 
        float porcentaje = 0.12f; 
        //Operación 12% 

        salida = entrada +(entrada * porcentaje); 

        System.out.println(" Salida de ETAPA 3: " + salida); 
        //ESTAPA 4

        ArrayList<Integer> dinamic = new ArrayList<>(); 
        int numero = -1; 
        while (numero != 0 ) {
            System.out.println(" Ingresa un numero (0 para terminar): ");
            numero = sc.nextInt();
            
            if (numero != 0) {
                dinamic.add (numero);
            }
            
        }

        int suma = 0; 

        for (int i = 0; i < dinamic.size(); i++){
            suma = suma + dinamic.get(i);
        }

        salida = entrada; 

        salida = entrada + suma; 

        System.out.println(" Salida de ETAPA 4: " + salida); 

        //ETAPA 5 

        entrada = salida; 

        int divisor = aleatorio.nextInt(9); 

        salida = entrada / divisor; 


        // Salida del sistema 
        System.out.println("============ Resultado");
        System.out.println("Mes:   " + mes);
        System.out.printf( "Salida de ETAPA 5: %.4f%n ", salida);







    




    }
}
