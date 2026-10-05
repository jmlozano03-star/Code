void main() {

//Asignar variables 
int filas_A, columnas_A, filas_B, columnas_B, filas_C, columnas_C;
float suma_matrices;
float elemento_A, elemento_B;

//Pedir dimención de matriz A y B 
filas_A = Integer.parseInt(IO.readln("Introduce numero de filas A"));
columnas_A = Integer.parseInt(IO.readln("Introduce numero de columnas A"));
filas_B = Integer.parseInt(IO.readln("Introduce numero de filas B"));
columnas_B = Integer.parseInt(IO.readln("Introduce numero de columnas B"));

//Decisión 
if (columnas_A != filas_B) {
    System.out.println("No se puede realizar la multiplicación porque el numero de columnas de A y numero de columnas de B no son iguales");
}else{
    filas_C = filas_A;
    columnas_C = columnas_B;

    Float[][] matriz_A = new Float[filas_A][columnas_A]; 
    Float[][] matriz_B = new Float[filas_B][columnas_B];
    Float[][] matriz_C = new Float[filas_C][columnas_C];

    //Ciclo para capturar la Matriz A 
    for(int i = 0; i < filas_A; i++){
        for(int j = 0; i < columnas_A; j++){
            elemento_A = Float.parseFloat(IO.readln("Introduce el valor de A ["+i+","+j+"]"));
            matriz_A[i][j] = elemento_A;
        }
    }

    //Ciclo para capturar la Matriz B 
    for(int i = 0; i < filas_B; i++){
        for(int j = 0; j < columnas_B; j++){
            elemento_B = Float.parseFloat(IO.readln("Introducir el valor de B ["+i+","+j+"]"));
            matriz_A[i][j] = elemento_B;
        }
    }
for(int i = 0; i < filas_C; i++){
    for(int j = 0; j < columnas_C; j++){
        suma_matrices = 0; 
        for(int k = 0; k < columnas_A; k++){
            
        }
    }
}

}
}
