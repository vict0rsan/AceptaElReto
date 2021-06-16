package volumen5;

import java.util.*;


public class problema578 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        while(true){
            
        HashMap<String, Integer> list = new HashMap<String, Integer>();
        
        int things = input.nextInt();
        input.nextLine();
        
        if(things == 0)
            break;
        
        String [] lista = new String[things];
        
        for(int i = 0; i < things; i++){
            lista[i] = input.nextLine().toLowerCase();
        }
        
        
        
        for(String s : lista){
             list.put(s, 1);
            
        }
        
        
            System.out.println(list.size());
        
        
    }
    }
    
}
