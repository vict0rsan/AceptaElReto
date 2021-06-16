
package volumen1;
import java.util.Scanner;
import java.util.Stack;

public class problema141 {   //me salta error de stackemptyexception y no entiendo por que????
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce casos de prueba: ");
        int casos = input.nextInt();
        input.nextLine();
        Stack pila = new Stack();
        pila.push('E'); //trate de arreglarlo asi para que nunca este vacio pero no funciono
        
        
        for(int i = 0; i < casos; i++){
            System.out.println("Introduce texto a compobar");
            String datos = input.nextLine();
            for(int j = 0; j<datos.length(); j++){
                
                if(datos.charAt(j) == '(' || datos.charAt(j) == '{' || datos.charAt(j) == '[' ){
                    pila.push(datos.charAt(j));
                    
                    System.out.println("letra en j: "+datos.charAt(j));
                }
                if((datos.charAt(j) == ')' && (Character) pila.peek() == '(' ) || 
                   (datos.charAt(j) == '}' && (Character) pila.peek() == '{' ) ||
                   (datos.charAt(j) == ']' && (Character) pila.peek() == '[' )){
                     pila.pop();
                }
                else 
                    break;
                
                    
            }
            
            pila.pop();
            
             
            if(pila.empty())
                System.out.println("YES");
            else
                System.out.println("NO");
            
        }
    }
    
}
