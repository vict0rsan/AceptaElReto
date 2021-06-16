
package volumen4;
import java.util.Scanner;

public class problema434 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int casos = s.nextInt();
        
        for(int i = 0; i < casos; i++){
            int palomas = s.nextInt();
            int palomares = s.nextInt();
            
            System.out.println(palomas-palomares > 0?"PRINCIPIO":"ROMANCE");
        }
        
    }
    
}
