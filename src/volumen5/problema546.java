package volumen5;
import java.util.*;

public class problema546 {
    public static void main(String[] args) { //tengo que practicar los putos hashmap
        Scanner s = new Scanner(System.in);
        int casos = s.nextInt();
        
        for(int i = 0; i < casos; i++){
            List <Integer> cromos_alex = new ArrayList();
            List <Integer> cromos_mateo = new ArrayList();
            Map <Integer, Integer> alex = new HashMap();
            Map <Integer, Integer> mateo = new HashMap();
             List <Integer> prueba1 = new ArrayList();
            List <Integer> prueba2 = new ArrayList();
            List <Integer> res = new ArrayList();
            
            int numero_alex = s.nextInt();
            for(int j = 0; j < numero_alex; j++){
                cromos_alex.add(s.nextInt());
            }
            
            int numero_mateo = s.nextInt();
            for(int k = 0; k < numero_alex; k++){
                cromos_mateo.add(s.nextInt());
            }
            
            for(int e : cromos_alex){
                if(alex.get(e)!= null)
                    alex.put(e, alex.get(e)+1);
                else
                     alex.put(e, 1);
            }
            
             for(int e : cromos_mateo){
                if(alex.get(e)!= null)
                    mateo.put(e, mateo.get(e)+1);
                else
                    mateo.put(e, 1);
            }
            
             
             for(Map.Entry<Integer, Integer> entry : alex.entrySet()){
                 if(entry.getValue()>1)
                     prueba1.add(entry.getKey());
             }
             for(Map.Entry<Integer, Integer> entry : mateo.entrySet()){
                 if(entry.getValue()>1)
                     prueba2.add(entry.getKey());
             }
            
            for(int e : prueba1){
                if(!cromos_mateo.contains(e))
                    res.add(e);
            }
            
            for(int e : prueba2){
                if(!cromos_alex.contains(e))
                    res.add(e);
            }
            
            for(int e: res){
                System.out.println(res);
            }
        }
        
    }
    
}
