package volumen3;

import java.util.*;

public class problema374 { //PERFECTO - por que da run-time error???

    public static void main(String[] args) {
        
        HashMap<Integer,Integer> temp = new HashMap<Integer,Integer>();
        
        ArrayList<Integer> datos = new ArrayList<Integer>();
        
        Scanner s = new Scanner(System.in);
        
        int casos = s.nextInt();
        
        for(int i = 0; i <casos; i++){
            
            int index = 0;
            
            do{
                int valor = s.nextInt();
                
                if(valor == 0)
                    break;
                
                datos.add(valor);
                
            }while(datos.get(index++) != 0);

            for(int num : datos){
                if(temp.get(num) == null){
                    temp.put(num, 1);
                }
                else{
                    temp.put(num, temp.get(num)+1);
                }
            }
            
            int max = Collections.max(datos);
            int min = Collections.min(datos);
            
            int maxReps = temp.get(max);
            int minReps = temp.get(min);
            
            System.out.println(min + " " + minReps + " " + max + " " + maxReps);
            
            temp.clear();
            datos.clear();

            
            
            
        }

    }
}
