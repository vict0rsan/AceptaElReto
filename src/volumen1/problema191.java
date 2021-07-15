
package volumen1;
import java.util.Scanner;

public class problema191 { //PERFECTO - ACCEPTED
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int casos = input.nextInt();
        int volumen = 0;
        
        for(int i=0; i<casos; i++){
            int compartimentos = input.nextInt();
            int mayorCapacidad = input.nextInt();
            int diferenciaCapacidad = input.nextInt();
            
            for(int j=0; j<compartimentos; j++){
                volumen = volumen + mayorCapacidad - j*diferenciaCapacidad;
            }
            System.out.println(volumen);
            volumen = 0;
            
        }
        
    }
    
}
