package volumen2;

import java.util.Scanner;

public class problema232 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int datos[] = new int[6];
        boolean check = true;
        int dias;
        int meses;
        int años;
        int diasTotales;

        do {
            for (int i = 0; i < 6; i++) {
                System.out.println("Introduce dato nº = " + i);
                datos[i] = input.nextInt();
            }
            
            dias = datos[3] - datos[0];
            if(dias<0)
                dias = 31 + dias;
            meses = datos[4] - datos[1];
            if(meses<0)
                meses = 12 + meses;
            años = datos[5] - datos[2];
            
            diasTotales = dias + meses*31 + (años-1)*365;
            if(diasTotales%365 != 0)
                System.out.println("diasTotales = " + diasTotales);
            
        } while (check == true);

    }

}
