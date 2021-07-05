package volumen2;
import java.util.Scanner;

public class problema255 {

    public static void main(String[] args) { //PERFECTO - ALGORITMO POCO EFICAZ

        Scanner input = new Scanner(System.in);

        while (true) {
            int pal = 1;
            String word = input.nextLine();

            for(int i = 0; i < word.length(); i++){
                String cut = word.substring(i);
                if(isPalindrome(cut) && cut.length() > pal){
                    pal = cut.length();
                    break;
                }

                for(int j = cut.length()-1; j > i; j--){
                    String cut2 = word.substring(i,j);
                    if(isPalindrome(cut2) && cut2.length() > pal){
                        pal = cut2.length();
                        break;
                    }
                }

            }

            System.out.println(pal);

        }
    }



        public  static boolean isPalindrome(String str)
        {

            // Pointers pointing to the beginning
            // and the end of the string
            int i = 0, j = str.length() - 1;

            // While there are characters to compare
            while (i < j) {

                // If there is a mismatch
                if (str.charAt(i) != str.charAt(j))
                    return false;

                // Increment first pointer and
                // decrement the other
                i++;
                j--;
            }

            // Given string is a palindrome
            return true;
        }

    }

