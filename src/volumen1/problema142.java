package volumen1;
import java.util.Scanner;

public class problema142 { //QUEDA POR HACER CASI TODO ME DABA PEREZA
    public static void main(String[] args) {
        int [] datos = new int[2];
        
        do{
            int i = 0;
            Scanner input = new Scanner(System.in);
            String line = input.nextLine();
            input = new Scanner(line);
            
            while(input.hasNextInt())
                datos[i++] = input.nextInt();
            
            
            if(datos[0]!= 0 && datos[1]!= 0){
                
                int [] niños = new int [datos[0]];
                int contador  = 0;
                int j = 0;
                
                do{
                    niños[j]=1;
                    
                    
                    
                    j = (j+datos[1])%niños.length;
                    
                    
                    contador++;
                }while(contador < niños.length);
                
                
            }
            
            
            
            
        }while(datos[0]!= 0 && datos[1]!= 0);
    }
    
}
