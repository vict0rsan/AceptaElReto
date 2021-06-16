package volumen2;
import java.util.Scanner;

public class problema262 {
    public static void main(String[] args) { //SE PRODUCE DESBORDAMIENTO ANTES DE PODER REALIZAR EL CALCULO DEL MODULO
        Scanner input= new Scanner(System.in);
        do{
            int suma = 0;
            System.out.println("Introduce el numero: ");
            int n = input.nextInt();
            System.out.println("Introduce la potencia: ");
            int p = input.nextInt();
            
            if( n == 0 && p == 0)
                break;
            
            for(int i = 1; i <= n; i++){
                suma+=Math.pow(i,p);
            }
            
            System.out.println(suma%46337);
            
            
            
            
            
        }while(true);
        
    }
    
}
