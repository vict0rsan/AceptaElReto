package volumen2;
import java.util.Scanner;

//PERFECTO

public class problema241 { 
    public static void main(String[] args) { 
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce casos de prueba: ");
        int casos = input.nextInt();
        
        
        for(int i = 0; i < casos; i++){
            System.out.println("Introduce hojas encontradas: ");
            int hojas = input.nextInt();
            
            if(hojas <= 0 || hojas >= 20000)
                break;
            
            if(hojas<3)
                System.out.println("IMPOSIBLE");
            else
                System.out.println(hojas/4);
        }
        
    }
    
}
