package volumen1;
import java.util.Scanner;


public class problema194 {  //no se me ocurre un algoritmo para resolver el problema
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        
    }
    
    public static int cuentaTuneles(String carreteras){
        int resultado = 0;
        int l = carreteras.length();
        int [] posiciones;
        int contador = 0;
        int localizador = 0;
        
        for(int i = 0; i < l; i++){
            if(carreteras.charAt(i) == '.')
                contador++;
        }
        posiciones = new int [contador];
        
        for(int j = 0; j<l; j++){
            if(carreteras.charAt(j) == '.'){
               posiciones[localizador] = j;
               localizador++;
            }
        }
        for(int k = 0; k < contador-2; k++ ){
            if(posiciones[k] + 1 == posiciones[k+1] || posiciones[k] + 2 == posiciones[k+2] ) //no se que hacer
                resultado = 0;
        }
        
        
        
        
        return resultado;
    }
    
}
