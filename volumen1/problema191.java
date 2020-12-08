
package volumen1;
import java.util.Scanner;

public class problema191 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce el numero de casos de prueba: ");
        int casos = input.nextInt();
        int volumen = 0;
        
        for(int i=0; i<casos; i++){
            System.out.println("Introduce compartimentos del acuario: ");
            int compartimentos = input.nextInt();
            System.out.println("Introduce el volumen del mayor compartimento ");
            int mayorCapacidad = input.nextInt();
            System.out.println("Introduce la diferencia de volumen entre compartimentos ");
            int diferenciaCapacidad = input.nextInt();
            
            for(int j=0; j<compartimentos; j++){
                volumen = volumen + mayorCapacidad - j*diferenciaCapacidad;
            }
            System.out.println("Volumen: "+volumen);
            volumen = 0;
            
        }
        
    }
    
}
