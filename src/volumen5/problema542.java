package volumen5;
import java.util.Scanner;

public class problema542 { //PERFECTO - ACCEPTED

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int casos = s.nextInt();
        
        for(int i = 0; i < casos; i++){
            int n1 = s.nextInt();
            int n2 = s.nextInt();
            int n3 = s.nextInt();
            int n4 = s.nextInt();
            int n5 = s.nextInt();
            int n6 = s.nextInt();
            
            int [] juguete = new int[]{n1,n2,n3};
            int [] caja = new int[]{n4,n5,n6};
            juguete = ordenador(juguete);
            caja = ordenador(caja);
            
            System.out.println((caja[0]>juguete[0] && caja[1]>juguete[1] && caja[2]>juguete[2])?"SIRVE":"NO SIRVE");
        }
    }

    public static int[] ordenador(int[]num){
        int temp;
        int count = num.length;
       for (int i = 0; i < count; i++) 
        {
            for (int j = i + 1; j < count; j++) { 
                
                if (num[i] > num[j]) 
                {
                    temp = num[i];
                    num[i] = num[j];
                    num[j] = temp;
                }
            }
        }
        return num;
    }
}
    

