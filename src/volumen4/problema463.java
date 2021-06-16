package volumen4;

import java.util.Scanner;

public class problema463 {
	
	public static void main(String [] args) { //ERROR EN LA LINEA 65 CON EL SEGUNDO CASO DE EJEMPLO
		
		Scanner input = new Scanner(System.in);
		
		
		
		String instrucciones = input.nextLine();
		
		int columnas = instrucciones.length();
		int filas = 0;
		int subidas = 0;
		int bajadas = 0;
		
		for(int i = 0; i < columnas; i++) {
			
			if(instrucciones.charAt(i) == 'S')
				subidas++;
			else if(instrucciones.charAt(i) == 'B')
				bajadas--;
		}
		
		filas = Math.abs(subidas-bajadas);
		
		char [][] pantalla = new char[filas+2][columnas+2];
		
		for(int i = 0; i < filas+2; i++) {
			for(int j = 0; j < columnas+2; j++) {
				pantalla[i][j] = '#';
				System.out.print(pantalla[i][j]);
			}
			System.out.println();
		}
		
		System.out.println();
		
		for(int i = 1; i < filas+1; i++) {
			for(int j = 1; j < columnas+1; j++) {
				pantalla[i][j] = ' ';
			}
		}
		
		
		int filasAux = filas-1;
		
		for(int i = 1; i < columnas + 1; i++) {
			
			
			
			if(instrucciones.charAt(i-1) == 'S') {
				if(instrucciones.charAt(i) != 'B') {
					pantalla[filasAux][i] = '/';
					filasAux--;
				}
				else if(instrucciones.charAt(i) == 'B') {
					pantalla[filasAux][i] = '/';
				}
			}
			else if(instrucciones.charAt(i-1) == 'B') {
				if(instrucciones.charAt(i) != 'S') {
					pantalla[filasAux][i] = 92;
					filasAux++;
				}
				else if(instrucciones.charAt(i) == 'S') {
					pantalla[filasAux][i] = 92;
				}
			}
			else
				pantalla[filasAux][i] = '_';
			
		}
		
		
		
		for(int i = 0; i < filas+2; i++) {
			for(int j = 0; j < columnas+2; j++) {			
				System.out.print(pantalla[i][j]);
			}
			System.out.println();
		}
		
		
	}

}
