package volumen5;
import java.util.Scanner;

public class problema550 {
    public static void main(String[] args) { //por que en el ejemmplo devuelve 3 para 7?
        
        Scanner input = new Scanner(System.in);
        int numero = 0;
        
        do{
            numero = 0;
            System.out.println("Introduce huecos de la galeria: ");
            int huecos = input.nextInt();
            if(huecos == 0)
                break;
            
            if(huecos%2==0)
                numero = huecos/2;
            else
                numero = (huecos/2) +1;
            
            System.out.print(numero+"\n");
            
        }while(numero!=0);
    }
  
    
}
