package volumen4;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class problema470 {

    public static void main(String [] args){ //CASOS DE PRUEBA BIEN PERO RUN TIME ERROR

        Scanner input = new Scanner(System.in);




            int counter = 0;

            String colores = input.nextLine();
            String aux = colores;
            char [] col = colores.toCharArray();



                while(aux.contains("RAV")) {
                    counter++;


                    Pattern word = Pattern.compile("RAV");
                    Matcher match = word.matcher(colores);

                    if(aux.length()<=3){
                        break;
                    }

                    if (match.find()) {
                        aux = aux.substring(0, match.start()) + aux.substring(match.end());
                    }

                }

            System.out.println(counter);






    }
}
