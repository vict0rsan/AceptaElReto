package volumen4;
import java.util.*;

public class problema492 {
    public static void main(String[] args) { //PROBLEMA PERFECTO PERO TIME LIMIT EXCEED
        
        Scanner s = new Scanner(System.in);
        
        while(true){
            
            int m = s.nextInt();
            int d = s.nextInt();
            int n = s.nextInt();
            
            if(m == 0 && d == 0 && n == 0)
                break;
            
            int counter = 0;
            
            for(int i = 1; i <= n; i++){
                if(i % m == 0 && i % d == 0)
                    counter++;
            }
            
            System.out.println(counter);
            
        }
        
    }
    
}
