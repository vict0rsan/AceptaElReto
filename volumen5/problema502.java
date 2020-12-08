
package volumen5;
import java.util.Scanner;


public class problema502 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce el numero de casos de prueba: ");
        int casos = input.nextInt();
        
        for(int i=0; i < casos; i++){
            int contadorMontones = 1;
            System.out.println("Introduce el numero de mejillones que te has comido: ");
            int numeroMejillones = input.nextInt();
            int tamañoMejillones [] = new int [numeroMejillones];
            
            for(int j = 0; j < numeroMejillones; j ++){
                tamañoMejillones[j] = input.nextInt();
            }
            for(int k = 0; k < numeroMejillones-1; k ++){
                if(tamañoMejillones[k] <= tamañoMejillones[k+1]){
                    contadorMontones++;
                }
            }
            System.out.println("Montones: " + contadorMontones);
        }
    }
    
}
