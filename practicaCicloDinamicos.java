import java.util.ArrayList;
public class practicaCicloDinamicos {
    public static void main(String[] args) {
        
        ArrayList <Integer> numeros = new ArrayList<>();

        numeros.add(5);
        numeros.add(8);
        numeros.add(3);
        numeros.add(10);

        int suma = 0; 
        int mayor = numeros.get(0);
        int menor = numeros.get(0);
        for(int i = 0; i < numeros.size(); ++i){
            suma = suma + numeros.get(i);
            if (numeros.get(i) > mayor) {
                mayor = numeros.get(i);
            }
            if (numeros.get(i) > menor) {
                menor = numeros.get(i);
            }
        }

        System.out.println("Sumatoria de numeros: " + suma);
        System.out.println("Lista de numeros: " + numeros.size());
        System.out.println("Numero mayor: " + mayor);
        System.out.println("Numero menor:" + menor);
    }
}
