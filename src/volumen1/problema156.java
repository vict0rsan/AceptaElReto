package volumen1;
import java.util.*;


public class problema156 {
    public static void main(String[] args) { //aceptado
        Scanner s = new Scanner(System.in);
        List <Integer> pisos = new ArrayList();
        
       while(true){
           
       while(true){
           int piso = s.nextInt();
           if(piso < 0)
               break;
           pisos.add(piso);
       }
       
           
       if(pisos.size()==0){
           pisos.clear();
           break;
       }
       
       
       int cuenta_pisos = 0;
       
       for(int i = 0; i < pisos.size()-1; i++){
           cuenta_pisos += (int)Math.abs(pisos.get(i)-pisos.get(i+1));
       }
       
        System.out.println(cuenta_pisos);
        pisos.clear();
        
       }
    }
    
}
