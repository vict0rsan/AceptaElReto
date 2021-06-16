package volumen5;
import java.util.Scanner;


public class problema540 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int casos = s.nextInt();
        
        for(int i = 0; i < casos; i++){
            int piso_vivienda = s.nextInt();
            int escalones = s.nextInt();
            int pisos_subidos = s.nextInt();
            int escalones_extra = s.nextInt();
            
            System.out.println((escalones_extra + pisos_subidos*escalones) + " " + (piso_vivienda*escalones+escalones_extra+pisos_subidos*escalones));
            
        }
        
    }
    
}
