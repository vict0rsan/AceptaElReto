package volumen4;
import java.util.Scanner;


public class problema481 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        char [] filaCh = new char []{'h','g','f','e','d','c','b','a'};
        
        while(true){
            int fila = s.nextInt();
            int columna = s.nextInt();
            
            if(fila == 0 && columna == 0)
                break;
            
            System.out.println(filaCh[fila-1]+""+columna);
        }
    }
    
}
