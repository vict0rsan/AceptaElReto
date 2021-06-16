package volumen4;
import java.util.*;

public class problema435 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        HashMap <Character, Integer> map = new HashMap();
        
        while(s.hasNext()){
            char[] numbers = new char[]{'0','1','2','3','4','5','6','7','8','9'};
            boolean sub = true;
            boolean allNumbers = true;
            String line = s.nextLine();
            
            for(int i = 0; i < line.length(); i++){
                if(map.get(line.charAt(i))!= null){
                    map.put(line.charAt(i), map.get(line.charAt(i))+1);
                }else{
                    map.put(line.charAt(i), 1);
                }
            }
            
            List<Integer> list = new ArrayList(map.values());
            List<Character> list2 = new ArrayList(map.keySet());
           
            for(int i = 0; i < numbers.length; i++){
                if(!list2.contains(numbers[i]))
                    allNumbers = false;
            }
            
            
            for(int i = 0; i < list.size()-1; i++)
              if(list.get(i) != list.get(i+1))
                  sub = false;
            
            System.out.println(sub && allNumbers? "subnormal":"no subnormal");
            
            map.clear();
            list.clear();
            list2.clear();
           
        }
    }
    
}
