void main() {
    
//Declarar variables

//
float suma_materias, promedio;
String nombre_alumno; 
 //Crear arreglo 
float[] Calificaciones = new float[4];
nombre_alumno = IO.readln("Escribe nombre de alumno:");

//Asigniar calificaciones 
Calificaciones[0] = Float.parseFloat(IO.readln("Calificación de Matematicas"));
Calificaciones[1] = Float.parseFloat(IO.readln("Calificación de Logica de Programación"));
Calificaciones[2] = Float.parseFloat(IO.readln("Calificación de Base de Datos"));
Calificaciones[3] = Float.parseFloat(IO.readln("calificación de Comunicación"));


//Operaciones para el promedio
suma_materias = 0;
suma_materias = (Calificaciones[0] + Calificaciones[1] + Calificaciones[2] + Calificaciones[3]);
promedio = (suma_materias / 4);

//Decisiones 
if (promedio < 5.9) {
    System.out.println("Rezagado");
}else{
    if (promedio < 7.9) {
        System.out.println("Aprobado");
    }else{
        if (promedio < 8.9) {
            System.out.println("Buen desempeño");
        }else{
            if (promedio <= 10) {
                System.out.println("Excelencia Academica");
            }
        }
    }
} 


// Pantalla de usuario de calificación
System.out.println("Nombre del estudiante: " + nombre_alumno);
System.out.println("Promedio General: " + promedio);
if (promedio >= 9.0 &&
    Calificaciones[0] >= 8.0 && 
    Calificaciones[1] >= 8.0 && 
    Calificaciones[2] >= 8.0 && 
    Calificaciones[3] >= 8.0) {
    
        System.out.println("Tienes beca del 20 por ciento en la siguiente inscripción");
} else {
    System.out.println("No tienes beca");
}

}
