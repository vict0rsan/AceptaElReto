package volumen2;
import java.util.Scanner;


public class problema274 {  //PERFECTO - ACCEPTED
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int casos = s.nextInt();
        
        
        for(int i = 0; i < casos; i++){
            
            int dias_ano = s.nextInt();
            int dias_semana = s.nextInt();
            int dias_inicio = s.nextInt();
            
            
            if(dias_inicio == 1)
            System.out.println((dias_ano)/dias_semana);
            else
            System.out.println(((dias_ano - (dias_semana -(dias_inicio - 1))))/dias_semana);
        }
        
    }
    
}
