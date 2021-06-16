package volumen4;
import java.util.Scanner;


public class problema407 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        while(true){
            int casillas = s.nextInt();
            int posicion = s.nextInt();
            int tirada = s.nextInt();
            
            if(casillas == 0 && posicion == 0 && tirada == 0)
                break;
            
            if(posicion+tirada >= casillas)
                System.out.println(casillas - (posicion + tirada)%casillas);
            else
                System.out.println(posicion+tirada);
                        
            
            
            
            
            
        }
    }
    
}
