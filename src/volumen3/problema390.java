package volumen3;

import java.util.Scanner;

public class problema390 {  //PERFECTO - ACCEPTED

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int casos = input.nextInt();

		for(int i = 0; i < casos; i++){

			int magenta = input.nextInt();
			int amarillo = input.nextInt();
			int cian = input.nextInt();

			String colores = input.nextLine();
			char [] pixeles = colores.toCharArray();

			for(int j = 0; j < pixeles.length; j++){

				switch(pixeles[j]){
				case 'N':
					magenta--;
					cian--;
					amarillo--;
					break;
				case 'R':
					magenta--;
					amarillo--;
					break;
				case 'L':
					magenta--;
					cian--;
					break;
				case 'V':
					cian--;
					amarillo--;
					break;
				case 'M':
					magenta--;
					break;
				case 'C':
					cian--;
					break;
				case 'A':
					amarillo--;
					break;
				default:

					break;
				}
			}

			if (magenta >= 0 && cian >= 0 && amarillo >= 0)
				System.out.println("SI " + magenta + " " + amarillo + " " + cian);
			else
				System.out.println("NO");

		}
	}
}
