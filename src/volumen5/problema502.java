
package volumen5;
import java.util.Scanner;


public class problema502 {
    public static void main(String[] args) {  //RUN TIME ERROR - CASOS DE PRUEBA CORRECTOS
        Scanner input = new Scanner(System.in);
        int casos = input.nextInt();
        
        for(int i=0; i < casos; i++){
            int contadorMontones = 1;
            int numeroMejillones = input.nextInt();
            int tamaoMejillones [] = new int [numeroMejillones];
            
            for(int j = 0; j < numeroMejillones; j ++){
                tamaoMejillones[j] = input.nextInt();
            }
            for(int k = 0; k < numeroMejillones-1; k ++){
                if(tamaoMejillones[k] <= tamaoMejillones[k+1]){
                    contadorMontones++;
                }
            }
            System.out.println(contadorMontones);
        }
    }
    
}
