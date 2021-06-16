package volumen4;

import java.util.Scanner;

public class problema439 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        System.out.println("Introduce el numero de casos de prueba: ");
        int casos = input.nextInt();
        input.nextLine();

        for (int i = 0; i < casos; i++) {
            int valordistancia = 0;
            int valorvelocidad = 0;
            int valortiempo = 0;
//            System.out.println("Introduce los valores deseados: ");
            String datos = input.nextLine();
            datos = datos.trim();
            int equal = datos.indexOf(' ');
            String dato1 = datos.substring(0, equal);
            String dato2 = datos.substring(equal + 1);
            //System.out.println("dato1 = " + dato1);
            //System.out.println("dato2 = " + dato2);
            char tipo1 = dato1.charAt(0);
            char tipo2 = dato2.charAt(0);

            switch (tipo1) {
                case 'D':
                    String distancia = dato1.substring(2);
                    valordistancia = Integer.parseInt(distancia);
                    break;
                case 'V':
                    String velocidad = dato1.substring(2);
                     valorvelocidad = Integer.parseInt(velocidad);
                    break;
                case 'T':
                    String tiempo = dato1.substring(2);
                     valortiempo = Integer.parseInt(tiempo);
                    break;
                default:
//                    System.out.println("Introduce valores validos");
            }
            switch (tipo2) {
                case 'D':
                    String distancia = dato2.substring(2);
                     valordistancia = Integer.parseInt(distancia);
                    break;
                case 'V':
                    String velocidad = dato2.substring(2);
                     valorvelocidad = Integer.parseInt(velocidad);
                    break;
                case 'T':
                    String tiempo = dato2.substring(2);
                     valortiempo = Integer.parseInt(tiempo);
                    break;
                default:
//                    System.out.println("Introduce valores validos");
            }
            
            if(valordistancia == 0){
                valordistancia = valorvelocidad*valortiempo;
                System.out.println("D=" + valordistancia );
            }
            else if (valorvelocidad == 0 ){
                valorvelocidad = valordistancia/valortiempo;
                System.out.println("V=" + valorvelocidad );
            }
            else if (valortiempo == 0){
                valortiempo = valordistancia/valorvelocidad;
                System.out.println("T=" + valortiempo );
            }

        }

    }

}
