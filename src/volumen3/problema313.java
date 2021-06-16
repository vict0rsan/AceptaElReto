package volumen3;
import java.util.Scanner;

public class problema313 { //PERFECTO
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce numero de casos: ");
        int casos = input.nextInt();
        
        for(int i = 0; i < casos; i++){
            boolean check = true;
            System.out.println("Introduce dinero en la cuenta: ");
            int inicio = input.nextInt();
            System.out.println("Introduce ingresos - gastos durante el mes: ");
            int fin = input.nextInt();
            
            if((inicio<0) ){
                if(fin < 0){
                    check = false;
                }
            }
            else if(inicio>=0){
                if(inicio+fin<0)
                    check = false;
            }
            System.out.println(check?"SI":"NO");
        }
    }
    
}
