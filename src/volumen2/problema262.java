package volumen2;
import java.math.BigInteger;
import java.util.Scanner;

public class problema262 {

    public static void main(String[] args) { //PERFECT - ACCEPTED

        Scanner input= new Scanner(System.in);

        while(true){

            int n = input.nextInt();
            int p = input.nextInt();
            
            if( n == 0 && p == 0)
                break;

            BigInteger suma = BigInteger.valueOf(0);
            BigInteger power;
            
            for(int i = 1; i <= n; i++){
                power = BigInteger.valueOf(i).pow(p);
                suma = suma.add(power);
            }
            
            System.out.println(suma.remainder(BigInteger.valueOf(46337)));

        }
    }
}
