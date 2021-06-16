
package volumen5;
import java.util.*;

public class problema582 {
    public static void main(String[] args) { //ACEPTADO
        
        Scanner s = new Scanner(System.in);
        
        int casos = s.nextInt();
        
        s.nextLine();
        
        for(int i = 0; i < casos; i++){
            
            
            boolean correcto = true;
            
            String campanadas = s.nextLine();
            
            if(campanadas.contains("ding"))
                correcto = false;
            
            
            String [] campanadas2 = campanadas.split(" ");
            
            if(!correcto)
                System.out.println("SALIDA NULA");
            else if(campanadas2.length==12)
                System.out.println("CORRECTO");
            else if(campanadas2.length == 1 && campanadas2[0].equals(""))
                System.out.println("MARISA NARANJO");
            else
                System.out.println("TARDE");
            
            
            
            
            
        }
    }
    
}
