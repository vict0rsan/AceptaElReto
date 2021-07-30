
package volumen2;
import java.util.Scanner;


public class problema217 { //PERFECTO - ACCEPTED
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        while(true){
            int portal = s.nextInt();
            
            if(portal==0)
                break;
            
            System.out.println(portal%2==0 ? "DERECHA" : "IZQUIERDA");
        }
    }
    
}
