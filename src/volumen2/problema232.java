package volumen2;

import java.util.Scanner;

public class problema232 {

    public static void main(String[] args) {  //comrpobar esta mas o menos la estructura
        Scanner input = new Scanner(System.in);
        int datos[] = new int[6];
        int[] days = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        do {
            int diasM = 0;
            for (int i = 0; i < 6; i++) {
                System.out.println("Introduce dato nº = " + i);
                datos[i] = input.nextInt();
            }
            if(datos[0] == 0 && datos[1] == 0 && datos[2] == 0 &&
                    datos[3] == 0 && datos[4] == 0 && datos[5] == 0)
                break;
            
            if(datos[4]-datos[1]<0){
                for(int i = datos[1]-1; i < days.length; i++){
                    diasM+=days[i];
                    System.out.println("de x hasta el final: "+diasM);
                    System.out.println("i: " + i);
                    System.out.println("days.length: " + days.length);
                }
                for(int j = 0; j < datos[4]-1;j++){
                    diasM+=days[j];
                    System.out.println("de 0 hasta y: " + diasM);
                }
                System.out.println("dias solo teniendo en cuenta los meses = " + diasM);
            }else if(datos[4]-datos[1]>0){
                for(int i = datos[1]-1; i < datos[4]-1; i++){
                    diasM+=days[i];
                }
                System.out.println("dias solo teniendo en cuenta los meses = " + diasM);
            }
          diasM = diasM-datos[0]+datos[3];
            
            System.out.println("dias tras tener en cuenta los dias tmb = " + diasM);
            
            diasM = diasM + (datos[5]-datos[2]-1)*365;
            System.out.println(" dias tras añadir años = " +  diasM);
            
            System.out.println(diasM);
            
        } while (true);

    }

}
