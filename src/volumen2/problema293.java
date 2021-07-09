package volumen2;

import java.util.Scanner;

public class problema293 { //PERFECT - ACCEPTED

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int casos = input.nextInt();

		for (int i = 0; i < casos; i++) {

			int[] datos = new int[5];

			for (int j = 0; j < 5; j++)
				datos[j] = input.nextInt();

			int suma = 0;

			suma = datos[0] * 6 + datos[1] * 8 + datos[2] * 10 + datos[3] * datos[4]*2;

			System.out.println(suma);
		}
	}
}
