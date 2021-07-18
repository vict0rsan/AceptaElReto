package volumen1;
import java.util.*;

public class problema141 { //PERFECTO - RUN TIME ERROR

    public static void main(String[]args){

        Scanner input = new Scanner(System.in);

        Stack <Character> pila = new Stack();

        pila.push('.'); //para que no me de un error si intenta acceder a la pila vacia

        String texto = input.nextLine();

        boolean correcto = true;

        for(int i = 0; i < texto.length(); i++){

            if(texto.charAt(i) == '(' || texto.charAt(i) == '[' || texto.charAt(i) == '{')
                pila.push(texto.charAt(i));

            if(texto.charAt(i) == ')'){
                if(pila.pop() != '('){
                    correcto = false;
                    break;
                }
            }
            if(texto.charAt(i) == ']'){
                if(pila.pop() != '['){
                    correcto = false;
                    break;
                }
            }
            if(texto.charAt(i) == '}'){
                if(pila.pop() != '{'){
                    correcto = false;
                    break;
                }
            }

        }

        System.out.println(correcto ? "YES" : "NO");

                
    }
    
}
