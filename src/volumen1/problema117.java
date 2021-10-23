package volumen1;
import java.util.Scanner;


public class problema117 { //PERFECT - ACCEPTED
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int cases = input.nextInt();
        input.nextLine();
        
        for(int i = 0; i < cases; i++){
            String presentation = input.nextLine();
            int whiteSpacePos = presentation.indexOf(" ");
            String name = presentation.substring(whiteSpacePos + 1);
            System.out.println("Hola, " + name + ".");
        }
    }
}
