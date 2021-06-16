package volumen3;
import java.util.Scanner;

public class problema373 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        System.out.println("Introduce casos de prueba: ");
        int casos = input.nextInt();
        
        for(int i = 0; i < casos; i++){
//           System.out.println("Introduce dimensiones del cubo: ");
            int t = input.nextInt();
            System.out.println(cubitos(t));
            
        }
        
    }
    public static int cubitos(int t){ //el algoritmo esta mal solucionar, da bien para los casos de prueba
        
        if(t == 2 || t== 1)
            return (int)Math.pow(t, 3);
        else{
            return (8+4*(t-3))*t+(t-2)*(t-2)*2;
        }
            
        
    }
    
}
