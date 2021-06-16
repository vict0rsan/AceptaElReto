package volumen5;

import java.util.Scanner;

public class problema518 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] dias = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        String s ="";
        
        do{
            //System.out.println("Introduce un numero: ");
            s = input.nextLine();
            if(s.equals("0.00")==true)
                break;
            int point = s.indexOf('.');
            
            int mes = Integer.parseInt(s.substring(0, point));
            int dia = Integer.parseInt(s.substring(point+1));
            
            
            if((mes>0&&mes<13)&&(dia<=dias[mes-1]&&dia!=0))
                System.out.print("SI\n");
            else
                System.out.print("NO\n");
            
            
        }while(!s.equals("0.00"));

    }

}
