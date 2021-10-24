package volumen5;

import java.util.*;

public class problema503 {

    public static void main(String[] args) { //PERFECT - ACCEPTED

        Scanner input = new Scanner(System.in);

        int cases = input.nextInt();

        for(int i = 0; i < cases; i++){
            int sidesDice1 = input.nextInt();
            int sidesDice2 = input.nextInt();
            int [][] combinations = createCombinations(sidesDice1, sidesDice2);
            List<Integer> mostProbableSums = mostProbableSum(combinations);
            Collections.sort(mostProbableSums);
            String mostProbableSumsText = Arrays.toString(mostProbableSums.toArray());
            System.out.println(mostProbableSumsText.substring(1, mostProbableSumsText.length() - 1).replaceAll(",", ""));
        }


    }

    public static int[][] createCombinations(int sidesDice1, int sidesDice2){
        int [][] combinations = new int [sidesDice1][sidesDice2];

        for(int i = 0; i < sidesDice1; i++){
            for(int j = 0; j < sidesDice2; j++){
                combinations[i][j] = (i+1)+(j+1);
            }
        }
        return combinations;
    }

    public static List<Integer> mostProbableSum(int[][] combinations){
        HashMap<Integer, Integer> probabilities = new HashMap<>();

        for(int i = 0; i < combinations.length; i++){
            for(int j = 0; j < combinations[0].length; j++){

                int number = combinations[i][j];
                if(probabilities.containsKey(number)){
                    probabilities.put(number, probabilities.get(number)+1);
                }else{
                    probabilities.put(number, 1);
                }
            }
        }
       int max = Collections.max(probabilities.values());

        List<Integer> keys = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : probabilities.entrySet()) {
            if (entry.getValue()==max) {
                keys.add(entry.getKey());
            }
        }

       return keys;
    }
}
