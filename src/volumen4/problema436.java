package volumen4;
import java.util.Scanner;

public class problema436 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        
        while(input.hasNext()){
        int doblado = 0;
        
            double grosor = input.nextInt();
            int altura = input.nextInt();
            grosor = grosor *  Math.pow(10, -6);
            for(int j = 0; grosor < altura; j++){
                grosor = grosor*2;
                doblado = j + 1;
                
            }
            System.out.println(doblado);
        }
    }
    
}
