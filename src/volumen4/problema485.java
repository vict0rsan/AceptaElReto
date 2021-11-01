package volumen4;

import java.util.Scanner;

public class problema485 { //PERFECT - ACCEPTED
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while(true){
            int routeStages = input.nextInt();

            if(routeStages==0)
                break;

            int [] stageDistances = new int[routeStages];
            int totalDistance = 0;

            for(int i = 0; i < routeStages; i++){
                stageDistances[i] = input.nextInt();
                totalDistance+= stageDistances[i];
            }

            System.out.print(totalDistance);

            for(int i = 0; i < routeStages-1; i++){
                System.out.print(" " + (totalDistance-stageDistances[i]));
                totalDistance-=stageDistances[i];
            }
            System.out.println();
        }
    }
}
