
package volumen3;
import java.util.Scanner;
import java.math.*;


public class problema377 {
    public static void main(String[] args) { //RUN TIME ERROR pero los casos de prueba los saca perfectamente
        Scanner s = new Scanner(System.in);
        
        while(s.hasNext()){
            
            BigInteger numero = new BigInteger(s.nextLine(), 10);
//            int numero = s.nextInt();
            String hex = numero.toString(16);
            
            char c = hex.charAt(hex.length()-1);
            
            if(c == '1' || c == '0' || c == '4' || c == '9')
                System.out.println("NO SE");
            else
                System.out.println("IMPERFECTO");
            
            
        }
    }
  
    
}
