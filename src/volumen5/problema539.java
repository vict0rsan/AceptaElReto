package volumen5;
import java.util.Scanner;


public class problema539 {
    public static void main(String[] args) {
         
        Scanner input = new Scanner(System.in);
        
        while(input.hasNext()){ //que lee en la primera iteracion el hasNext()??? por que esta mal hotiaputa ya bro
            int dato1 = input.nextInt();
            int dato2 = input.nextInt();
            
            System.out.println(((dato2 - dato1) % 10 == 9)?"FELIZ DECADA NUEVA":"TOCA ESPERAR");
        }
        
    }
    
}
    
    

