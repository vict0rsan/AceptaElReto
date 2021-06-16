package volumen3;
import static java.lang.Character.*;
import java.util.*;


public class problema372 { //NO SE PONEN CORRECTAMENTE LAS MAYUSCULAS - linea 30
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int casos = s.nextInt();
        s.nextLine();
        
        for(int i = 0; i < casos; i++){
            String line = s.nextLine();
            System.out.println(reverse2(line));
            
        }
    }
    
    public static String reverse2(String line){
        ArrayList<Integer> list = new ArrayList();
        
        
        for(int i = 0; i < line.length(); i++){
            if(isUpperCase(line.charAt(i)))
                list.add(i);
        }
        String swaped = reverse(line);
        swaped = swaped.toLowerCase();
        
        for(int i = 0; i < list.size(); i++){ //por que esto no pone las letras en mayuscula???
            Character.toUpperCase(swaped.charAt(list.get(i)));
            System.out.println("poniendo mayusculas en: " + list.get(i));
        }
        
        
        
        return swaped;
    }
    
    public static String reverse(String line){
        String res = "";
        for(int i = line.length()-1; i >= 0; i--)
            res+=line.charAt(i);
        
        return res;
    }
    
}
