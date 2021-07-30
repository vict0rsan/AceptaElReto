package volumen2;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.*;

public class problema232 { //PERFECTO - ERROR POR USAR API DE JAVA 8

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int fechas[] = new int[6];
        int[] days = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        while(true) {

            for(int i = 0; i < 6; i++)
                fechas[i] = input.nextInt();

            if (fechas[0] == 0 && fechas[1] == 0 && fechas[2] == 0 && fechas[3] == 0 && fechas[4] == 0 && fechas[5] == 0)
                break;

            LocalDate bornDate = LocalDate.of(fechas[2],fechas[1],fechas[0]);
            LocalDate currentDate = LocalDate.of(fechas[5],fechas[4],fechas[3]);

            long daysElapsed = ChronoUnit.DAYS.between(bornDate, currentDate);

            int diasCumpleaños = fechas[5] - fechas[2];
            int diasBisiestos = diasCumpleaños/4;
            int extra = 0;

            if(fechas[4] <= fechas[1]){
                if(fechas[3] < fechas[0])
                    extra--;
            }

            if(daysElapsed == 365)
                System.out.println(0);
            else
                System.out.println(daysElapsed - diasCumpleaños - diasBisiestos - extra);
        }
    }
}
