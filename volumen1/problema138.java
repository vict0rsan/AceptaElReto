package volumen1;
import java.util.Scanner;

public class problema138 { //el programa funciona pero pierde muchisima precision
                           //como se puede resolver sin que pierda precision???
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce numero de casos de prueba: ");
        int casos = input.nextInt();
        for(int i = 0; i < casos; i++){
            System.out.println("Introduce el numero que deseas comprobar: ");
            double prueba = input.nextInt();
            double factorial = factorial(prueba);
            System.out.println("Numero de ceros: " + calculaZeros(factorial));
        }
        
        
    }
    
    public static int calculaZeros (double numero){
        int ceros = 0;
        
        do{
         if(numero%10 == 0){
             ceros++;
             numero = numero/10;
             //System.out.println("ceros= " + ceros);
             //System.out.println("numero= " + numero);
         }
            //System.out.println("PROBANDO");
        }while(numero%10 == 0);
        
        
        return ceros;
    }
    
    public static double factorial (double numero){
        double resultado = numero;
        
        for(int i = 0; i < numero-2; i++){
            resultado = resultado * (numero - i -1 );
            //System.out.println("Resultado= " + resultado);
        }
        
        return resultado;
    }
}
