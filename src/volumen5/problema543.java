package volumen5;
import java.util.*;


public class problema543 { //pendiente
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int casos = s.nextInt();
        
        for(int i = 0; i < casos; i++){
            int sombrillas = s.nextInt();
            for(int j = 0; j < sombrillas; j++){
                int x = s.nextInt();
                int y = s.nextInt();
                int r = s.nextInt();
            }
        }
        
    }
    
}

class Sombrilla{
    int x, y, r;
    public Sombrilla(int x, int y, int r){
        this.x = x;
        this.y = y;
        this.r = r;
    }
}
