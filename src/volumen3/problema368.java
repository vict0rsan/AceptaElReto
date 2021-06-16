package volumen3;
import java.util.Scanner;


public class problema368 { //RUN TIME EXCEPTION NO SE POR QUE
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        while(true){
            int huevos_deseados = s.nextInt();
            int capacidad_olla = s.nextInt();
            if(huevos_deseados == 0 && capacidad_olla == 0)
                break;
            
            int division = huevos_deseados/capacidad_olla;
            if(division < 1)
                System.out.println("10");
            else if (huevos_deseados%capacidad_olla==0)
                System.out.println(10*(division));
            else
               System.out.println(10*(1+division)); 
            
            
            
        }
    }
         
    
}
