package volumen4;
import java.util.Scanner;


public class problema433 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        while(true){
        int contador = 1;
        int uvas = s.nextInt();
        
        if(uvas == 0)
            break;
        
        for(int i = 1; i < uvas; i++){
            uvas = uvas - i;
            contador++;
        }
            System.out.println(contador);
        }
    }
    
}
