package volumen5;
import java.util.*;


public class problema587 {
    public static void main(String[] args) {  //ACEPTADO
        
        Scanner input = new Scanner(System.in);
        
        int casos = input.nextInt();
        input.nextLine();
        
        for(int i = 0; i < casos; i++){
            int sum = 0;
            String s = input.nextLine();
            
            for(int j = 0; j < s.length(); j+=2){
                char primero = s.charAt(j);
                char segundo = s.charAt(j+1);
                
                if(primero==segundo){
                    sum+=2;
                }
                else
                    sum++;
            }
            
            System.out.println(sum);
        }
    }
    
    
}
