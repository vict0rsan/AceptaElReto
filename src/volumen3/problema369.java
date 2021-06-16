
package volumen3;
import java.util.Scanner;


public class problema369 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        while(true){
        int numero = input.nextInt();
        
        if(numero == 0)
            break;
        
        for(int i = 0; i < numero; i++){
            System.out.print("1");
        }
        System.out.println("");
        }
    }
    
}
