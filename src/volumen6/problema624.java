package volumen6;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class problema624 { //PERFECT - ACCEPTED

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        while(true){
            int numeroCalcetines = input.nextInt();

            if(numeroCalcetines == 0)
                break;

            int [] sizes = new int[numeroCalcetines];

            for(int i = 0; i < numeroCalcetines; i++)
                sizes[i] = input.nextInt();

            int maximumUnpairedSockets = maxUnpairedSockets(sizes);
            System.out.println(maximumUnpairedSockets);
        }
    }

    public static int maxUnpairedSockets(int [] sizes){
        Set<Integer> set = new HashSet<>();
        int max = Integer.MIN_VALUE;

        for(Integer num : sizes){
            if(!set.contains(num))
                set.add(num);
            else
                set.remove(num);
            max = Math.max(max, set.size());
        }
        return max;
    }
}
