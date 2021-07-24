package volumen1;
import java.math.BigInteger;
import java.util.*;

public class problema138 { //PERFECTO - RUN TIME ERROR

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int casos = input.nextInt();
        input.nextLine();

        for(int i = 0; i < casos; i++){

            int ceros = 0;

            String num = input.nextLine();

            BigInteger numero = factorial(new BigInteger(num));

            while(numero.remainder(BigInteger.valueOf(10)).equals(BigInteger.ZERO)){
                ceros++;
                numero = numero.divide(BigInteger.valueOf(10));
            }

            System.out.println(ceros);

        }
    }

    public static BigInteger factorial(BigInteger n){
        if (n.equals(BigInteger.ZERO))
            return BigInteger.ONE;
        else
            return n.multiply(factorial(n.subtract(BigInteger.ONE)));
    }
}
