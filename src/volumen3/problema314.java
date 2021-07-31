package volumen3;
import java.util.Scanner;

public class problema314 { //PERFECTO

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int casos = input.nextInt();
        
        for(int i = 0; i < casos; i ++){
            int picos = 0;
            int valles = 0;
            
            int numeroTemperaturas = input.nextInt();
            int [] temperaturas = new int [numeroTemperaturas];
            
            for(int j = 0; j < temperaturas.length; j++){
                temperaturas[j] = input.nextInt();
            }
            
            for(int k = 1; k < temperaturas.length-1; k++){
                if(temperaturas[k]>temperaturas[k+1]&&temperaturas[k]>temperaturas[k-1])
                    picos++;
                else if(temperaturas[k]<temperaturas[k+1]&&temperaturas[k]<temperaturas[k-1] )
                    valles++;
            }

            System.out.println(picos + " " + valles);

        }
    }
}
