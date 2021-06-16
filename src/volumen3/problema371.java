package volumen3;
import java.util.Scanner;


public class problema371 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero;
        
        do{
            int resultado;
            int triangulitos = 0;
           // System.out.println("Introduce numero: ");
            numero = input.nextInt();
            
            if(numero!=0 && numero > 0 && numero < 20000){
                for(int i = 1; i < numero; i++)
                triangulitos+= numero - i;
                
                
                resultado = numero*3 + 3*triangulitos;
                
                System.out.println(resultado);
                
            }
            
        }while(numero!=0);
    }
            
    
}
