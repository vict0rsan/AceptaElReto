package volumen3;
import java.util.Scanner;

public class problema304 {
    public static void main(String[] args) { //casos de prueba bien pero WRONG ANSWER
        Scanner input = new Scanner(System.in);
        int casos = input.nextInt();
        
        for(int i = 0; i < casos; i++){
            int q = 0;
            int r = 0;
            int n1 = input.nextInt();
            int n2 = input.nextInt();
            
            if(n2 != 0){
            if(n1%n2 > 0){
                q = n1/n2;
                r = n1%n2;
                System.out.println(q + " " + r);
            }
            else if (n1%n2 < 0 && ((n1 > 0 && n2<0) || (n1 < 0 && n2>0))  ){
                q = (n1/n2)-1;
                r = (int)Math.abs(q*n2)-(int)Math.abs(n1);
                System.out.println(q + " " + r);
                
            }
            else if(n1%n2 < 0 && n1 < 0 && n2<0){
                q = (n1/n2)+1;
                r = (int)Math.abs(q*n2)-(int)Math.abs(n1);
                System.out.println(q + " " + r);
                
            }
            }else
                System.out.println("DIV0");
                    
            
        }
        
        
    }
    
}
