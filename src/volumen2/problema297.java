package volumen2;

import java.util.*;

public class problema297 {

	public static void main(String[] args) { //PERFECTO - ACCEPTED

		Scanner input = new Scanner(System.in);

		int casos = input.nextInt();

		for(int i = 0; i < casos; i++){

			int suma = 0;

			while(true) {

				int valor = input.nextInt();
				if (valor == 0)
					break;
				String simbolo = input.next();

				switch (simbolo) {
				case "o":
					suma += valor;
					break;
				case "da":
					suma += (valor * 10);
					break;
				case "h":
					suma += (valor * 100);
					break;
				case "k":
					suma += (valor * 1000);
					break;
				case "M":
					suma += (valor * 1000000);
					break;
				case "G":
					suma += (valor * 1000000000);
					break;
				default:
					System.out.println("Introduce un símbolo válido || símbolo actual: " + simbolo);
				}
			}

				if (suma % 10 != 0) {
					System.out.println(suma + " o");
				}
				else if(suma%10 == 0 && suma%100!=0){
					System.out.println(suma/10 + " da");
				}
				else if(suma%100 == 0 && suma%1000!=0){
					System.out.println(suma/100 + " h");
				}
				else if(suma%1000 == 0 && suma%1000000!=0){
					System.out.println(suma/1000 + " k");
				}
				else if(suma%1000000 == 0 && suma%1000000000!=0){
					System.out.println(suma/1000000 + " M");
				}
				else{
					System.out.println(suma/1000000000 + " G");
				}


		}
	}
}
