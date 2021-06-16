package volumen3;
import java.util.Scanner;


public class problema314 { //PERFECTO
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce casos de prueba: ");
        int casos = input.nextInt();
        
        for(int i = 0; i < casos; i ++){
            int picos = 0;
            int valles = 0;
            
            System.out.println("Introduce numero de muestras: ");
            int m = input.nextInt();
            int [] temp = new int [m];
            
            for(int j = 0; j < temp.length; j++){
                System.out.println("Introduce dato numero: " + (j+1));
                temp[j]=input.nextInt();
            }
            
            for(int k = 1; k < temp.length-1; k++){
                if(temp[k]>temp[k+1]&&temp[k]>temp[k-1])
                    picos++;
                else if(temp[k]<temp[k+1]&&temp[k]<temp[k-1] )
                    valles++;
            }
            System.out.println("picos = " + picos);
            System.out.println("valles = " + valles);
        }
        
    }
    
}
