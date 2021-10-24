package volumen5;
import java.util.Scanner;

public class problema529 {

    public static void main(String[] args) { //PERFECT - ACCEPTED
        Scanner input = new Scanner(System.in);
        int cases = input.nextInt();
        input.nextLine();

        for (int i = 0; i < cases; i++) {
            String data = input.next();
            char[] logs = data.toCharArray();
            int login = 0;
            int max = 0;

            for (int j = 0; j < logs.length; j++) {
                if (logs[j] == 'I') login++;
                if (logs[j] == 'O') {
                    if (login > 0) login--;
                    else max++;
                }
                max = Math.max(max, login);
            }
            System.out.println( max );
        }
    }
}
