package volumen3;
import java.util.Scanner;

public class problema375 {
    public static void main(String[] args) { //me sale wrong answer pero los casos de prueba estan bien wtf?
        Scanner s = new Scanner(System.in);
        
        while(s.hasNext()){
            String line = s.nextLine();
            int num = Integer.parseInt(line.substring(0, 2));
            System.out.println(num);
            char c = Character.MIN_VALUE;
            if(line.length() == 3)
                c = line.charAt(2);
            
            
            int numero = 36 - num;
             
            
            switch(c){
                case 'L':
                    c = 'R';
                    break;
                case 'R':
                    c = 'L';
            }
            
            if(numero>=10)
            System.out.println(numero+""+c);
            else
                System.out.println("0"+numero+""+c);
            
        }
    }
    
}
