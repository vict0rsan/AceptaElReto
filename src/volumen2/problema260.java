package volumen2;

import java.util.Arrays;
import java.util.Scanner;

public class problema260 {

    public static void main(String[] args) { //PERFECT - ACCEPTED

        Scanner input = new Scanner(System.in);

        int cases = input.nextInt();
        input.nextLine();

        for (int i = 0; i < cases; i++) {
            String word1 = input.nextLine();
            String word2 = input.nextLine();
            anagram(word1, word2);
        }
    }

    public static void anagram (String word1, String word2){
        char[] word_1 = word1.replaceAll("[\\s]", "").toLowerCase().toCharArray();
        char[] word_2 = word2.replaceAll("[\\s]", "").toLowerCase().toCharArray();
        Arrays.sort(word_1);
        Arrays.sort(word_2);
        System.out.println(Arrays.equals(word_1, word_2) ? "SI" : "NO");
    }
}
