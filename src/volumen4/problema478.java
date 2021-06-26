
package volumen4;
import java.util.*;


public class problema478 { // casos de prueba y funcionamiento general bien pero RTE
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        while(true){
            int hechizos = s.nextInt();
            if(hechizos == 0)
                break;
            
            int suma_poder = 0;
            
            int [] poder_hechizos = new int[hechizos];
            
            
            for(int i = 0; i < hechizos; i++){
                poder_hechizos[i] = s.nextInt();
                suma_poder+=poder_hechizos[i];
            }
            
            int daN = s.nextInt();
            
            int busqueda = suma_poder - daN;
            
            int num1 = 0;
            int num2 = 0;
            boolean cancelar = false;
            
            for(int i = 0; i < hechizos; i++){
                for(int j = 1; j < hechizos; j++){
                    if(poder_hechizos[i]+poder_hechizos[j] == busqueda){
                        num1 = poder_hechizos[i];
                        num2 = poder_hechizos[j];
                        cancelar = true;
                    }
                }
                if(cancelar == true)
                    break;
            }
            
            System.out.println(num1 + " " + num2);
            
            
            
            
            
            
        }
    }
    
}
