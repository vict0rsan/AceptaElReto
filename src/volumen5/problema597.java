package volumen5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class problema597 { //PERFECT - MEMORY LIMIT EXCEED

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int cases = input.nextInt();

        for(int i = 0; i < cases; i++){
            int people = input.nextInt();
            List<Integer> peoplesOrder = new ArrayList<>();

            for(int j = 0; j < people; j++)
                peoplesOrder.add(input.nextInt());

            System.out.println(getConArtists(peoplesOrder));
        }
    }

    public static int getConArtists(List<Integer> peoplesOrder){
        int conArtists = 0;

        for(int i = 0; i < peoplesOrder.size(); i++){
            int minValue = Collections.min(peoplesOrder);
            if(minValue != peoplesOrder.get(i)){
                conArtists++;
            }
            peoplesOrder.remove(i);
        }
        return conArtists;
    }
}

