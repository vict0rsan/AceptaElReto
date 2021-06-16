
package volumen5;
import java.util.Scanner;


public class problema532 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("¿Cuántos casos quieres evaluar?");
        int casos = input.nextInt();
        
        for( int i = 0; i < casos; i++){
            System.out.println("Introduce el peso neto del producto: ");
            int nproducto = input.nextInt();
            System.out.println("Introduce el peso total del producto: ");
            int tproducto = input.nextInt();
            System.out.println("Peso del envase: " + (tproducto - nproducto));
            
        }
        
        
    }
    
}
