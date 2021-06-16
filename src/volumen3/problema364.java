package volumen3;
import java.util.Scanner;


public class problema364 {
    public static void main (String[]args){
        Scanner input = new Scanner(System.in);
        String abecedario = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String texto = null;
        String resultado = "";
        
        do{
            System.out.println("Introduzca que desea chiquitin: ");
            texto = input.nextLine();
            
            for(int i = 0; i < texto.length(); i++){
                char c = texto.charAt(i);
                if(c != ' '&& c!= 'Z'){
                int posicion = abecedario.indexOf(c);
                char n = abecedario.charAt(posicion+1);
                resultado = resultado + n;
                }
                else if(c == 'Z'){
                    resultado = resultado + 'A';
                }
                else if( c == ' '){
                    resultado = resultado + ' ';
                }
            }
            //System.out.println(resultado);
            resultado = "";
            //System.out.println("texto = " + texto);
            
        }while(texto.equalsIgnoreCase("FIN") != true);
    }
    
}
