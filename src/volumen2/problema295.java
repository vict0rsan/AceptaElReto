package volumen2;

import java.math.BigInteger;
import java.util.Scanner;

public class problema295 {  //PERFECTO - ACCEPTED

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		while(true){


			int base = input.nextInt();
			int exp = input.nextInt();

			if (base == 0 && exp == 0)
				break;

			BigInteger baseB = new BigInteger(String.valueOf(base));
			BigInteger expB = new BigInteger(String.valueOf(exp));
			BigInteger modB = new BigInteger(String.valueOf(31543));

			BigInteger big = baseB.modPow(expB,modB);

			long res = big.longValue();


			System.out.println(res);

		}
	}
}
