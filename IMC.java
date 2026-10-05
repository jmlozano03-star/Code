public class IMC {

    //Constantes
        public static final double bajo_peso = 18.5;
        public static final double peso_normal = 24.9;
        public static final double sobre_peso = 29.9;
        public static final double obesidad_grado_l = 34.5;
        public static final double obesidad_grado_ll = 39.9;
        public static final double obesidad_grado_lll = 40.0;

    public static void main(String[] args) {
  do{
        //Datos de entrada 
         double peso_kg = Double.parseDouble(IO.readln("Ingresa tu peso en kg"));
         double altura_m = Double.parseDouble(IO.readln("Ingresa tu estura en m"));

         //Operaciones IMC
         double IMC = (altura_m / (peso_kg * peso_kg));

         System.out.println("IMC:" + IMC);

         if (IMC < bajo_peso) {
            System.out.println("Bajo peso");

         }else{
            if (IMC < peso_normal) {
                System.out.println("Peso normal");
            }else{
                if (IMC < sobre_peso) {
                    System.out.println("Sobre peso");
                }else{
                    if (IMC < obesidad_grado_l) {
                        System.out.println("Obesidad grado I");
                    }else{
                        if (IMC < obesidad_grado_ll) {
                            System.out.println("Obesidad grado II");
                        }else{
                            if (IMC >= obesidad_grado_lll) {
                                System.out.println("Obesidad grado III");
                            }
                        }
                    }
                }
            }
         }
         
         int siguiente = Integer.parseInt(IO.readln("Presiona 1 para calcular otro IMC:"));
        }while( siguiente == 1 );




    }
}
