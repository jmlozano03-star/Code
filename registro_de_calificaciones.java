public class registro_de_calificaciones {
    public static void main(String[] args) {
        
        //Pedir cantidad de alumnos
        int alumnos = Integer.parseInt(IO.readln("Ingresa la cantidad de alumnos: "));

        //Arreglo
        float[] calificaciones = new float[alumnos];
        
        // Contador aprobados y reprobados  
        int aprobados = 0;
        int reprobados = 0;
        
        // Acumulador calificación grupal
        float sumatoria_calificaciones = 0; 

         // Analizar califica más alta y baja 
        float maxima = calificaciones[0];
        float minima = calificaciones[0]; 


        // Ciclo para recopilar calificaciones 
        for(int i = 0; i < alumnos; i++){
            calificaciones[i] = Float.parseFloat(IO.readln("Ingresar calificación " + i +": "));
            while (calificaciones[i] < 0 || calificaciones[i] > 10 ) {
                System.out.println("¡¡Error!!");
                System.out.println("Calificación tiene que ser mayor a 0 y menor a 10");

                calificaciones[i] = Float.parseFloat(IO.readln("Volver calificación" +i+ ": "));
            }
            if (calificaciones[i] < 6.0) {
                reprobados++;
            }else{
                aprobados++;
            }
            sumatoria_calificaciones = sumatoria_calificaciones + calificaciones[i];

            if (calificaciones[i] > maxima) {
                maxima = calificaciones[i];
            }
            if (calificaciones[i] < minima) {
                minima = calificaciones[i];
            }
        }

        //Promedio grupal 
        float promedio_grupal;
        promedio_grupal = sumatoria_calificaciones / alumnos;

       
        //Pantalla final 
        System.out.println("========REPOR DEL GRUPO=========");
        System.out.println("Alumnos registrados:" +alumnos);
        System.out.println("Promedio grupal: " + promedio_grupal);
        System.out.println("Aprobados: " + aprobados);
        System.out.println("Reprobados: " + reprobados);
        System.out.println("Calificación maxima: " + maxima);
        System.out.println("Calificación minima:  " + minima);



    }
    
}
