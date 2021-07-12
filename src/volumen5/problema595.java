package volumen5;

import java.util.Scanner;

public class problema595 {  //PERFECTO - ACCEPTED

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int casos = input.nextInt();
		input.nextLine();

		for(int i = 0; i < casos; i++){

			String dato = input.next();
			String datoTrasnformable = null;

			if(dato.length()==3)
				datoTrasnformable = dato.substring(0,1);
			else if(dato.length()==4)
				datoTrasnformable = dato.substring(0,2);
			else if(dato.length()==5)
				datoTrasnformable = dato.substring(0,3);
			else if(dato.length()== 6)
				datoTrasnformable = dato.substring(0,4);

			int volumen = Integer.parseInt(datoTrasnformable);

			System.out.println(volumen);
		}
	}
}
