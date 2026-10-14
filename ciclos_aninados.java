import java.util.Scanner;

public class ciclos_aninados {
    public static void main(String[] args) {
    

    
   Scanner entrada = new Scanner(System.in);

   int cantidad; 
   String sabor;
   int precio;

   for(int dia = 1; dia <= 2; ++dia){

    int total_paletas = 0;
    double dinero_dia =0;

    System.out.println("\n=======día" +dia+ "========");

    for(int i = 1; i<=3; i++){
        switch (i) {
            case 1:
                sabor = "Fresa";
                precio = 15;
                break;

            case 2:
                sabor = "Limon";
                precio = 12;
                break;

            case 3: 
                sabor = "coco";
                precio = 18;
                break;
            default:
                sabor = "";
                precio = 0;
                break;
            }
                System.out.println("¿Cuántas paletas de" + sabor + " se vendieron?");

            
            cantidad = entrada.nextInt();
            
            total_paletas = total_paletas + cantidad;
            dinero_dia = dinero_dia + (cantidad * precio);
            
            
        
            }

            

            System.out.println("\n--- Resultados del dia " + dia + " ---");
            System.out.println("Total de paletas vendidas: " + total_paletas);
            System.out.printf("Dinero recaudado: $%.2f%n", dinero_dia);

   }

entrada.close();
 }   

}


    

