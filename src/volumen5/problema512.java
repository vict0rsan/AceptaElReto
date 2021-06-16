
package volumen5;
import java.util.Scanner;


public class problema512 {
    public static void main (String[]args){
        System.out.println("Introduce el número de casos de prueba: ");
        Scanner input = new Scanner(System.in);
        int casos = input.nextInt();
        
        for(int i = 0; i < casos; i++){
            System.out.println("Introduce los kg de caballo que vas a introducir: ");
            int conejo = input.nextInt();
            System.out.println("Introduce los kg de conejo que vas a introducir: ");
            int caballo = input.nextInt();
            int pconejo = Math.round((conejo*100)/(conejo+caballo));
            System.out.println("Porcentaje de conejo en la mezcla: " + pconejo + "%");
        }
    }
    
}
