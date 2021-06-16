package volumen1;

import java.util.Scanner;

public class problema126 { //CORREGIR DUDAS

    public static void main(String[] args) {
        double[] numeros = new double[2];
        
        do {
            Scanner input = new Scanner(System.in);
            int i = 0;
            System.out.println("Introduce datos: ");

            String datos = input.nextLine();

            input = new Scanner(datos);

            while (input.hasNextDouble()) {
                numeros[i++] = input.nextDouble();
            }
           
            if(numeros[0] != 0 && numeros[1] != 0){
                
                double n = factorial(numeros[1]);
                System.out.println(n);
                boolean test = reminder0(n,numeros[0]);
                System.out.println(test);
                
                System.out.println(test?"YES":"NO");
            }
            
        } while ((numeros[0] != 0 && numeros[1] != 0));
    }
    
    
    
    public static double factorial(double n){ //COMO PUEDO HACER PARA CALCULAR EL FACTORIAL SIN QUE DESBORDE
        if(n > 1)
            return n*factorial(n-1);
        else
            return n*1;
    }
    
    public static boolean reminder0(double n, double p){
        return n%p==0;
    }

}
