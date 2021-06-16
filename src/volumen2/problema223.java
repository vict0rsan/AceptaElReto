package volumen2;

import java.util.*;

public class problema223 { //RUN TIME ERROR, los casos de prueba los devuelve perfectps

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        int casos = input.nextInt();

        for (int i = 0; i < casos; i++) {
            input = new Scanner(System.in);
            int numeros = input.nextInt();
            input.nextLine();
            int k = 0;
            int[] cadena_numeros = new int[numeros];

            for (int j = 0; j < numeros; j++) {
                cadena_numeros[k++] = input.nextInt();
            }

            List<almacenador2> datos = new ArrayList();
            int pos_inicial = 0;
            int pos_final = 0;
            int multiplicacion = 1;
            int contador = 0;
            int pos_lista = 0;
            boolean zero = false;
            
            
            for(int j = 0; j < numeros; j++){
                
                    multiplicacion *= cadena_numeros[j];
                    
                    if(cadena_numeros[j] == 0){
                        multiplicacion = 1;
                        zero = true;
                        break;
                        
                    }
                    
                
                
            }
            
            
            if(zero == true){
            for (int j = 0; j < numeros; j++) {

                if (cadena_numeros[j] != 0) {
                    multiplicacion*=cadena_numeros[j];
                    contador++;
                    }
                
                else{
                    pos_inicial = j - contador;
                    pos_final = j - 1;
                    datos.add(new almacenador2(pos_inicial, pos_final, multiplicacion, contador));
                    pos_lista++;
                    
                    pos_inicial = 0;
                    pos_final = 0;
                    multiplicacion = 1;
                    contador = 0;

                }

            }
            
            Collections.sort(datos, new ComparadorDePrueba());
}
            
            if(zero == true && datos.size() == 1)
                System.out.println("SIGUE BUSCANDO");
            else if(zero == true)
                System.out.println(datos.get(datos.size()-1).contador + " -> " + "[" + datos.get(datos.size()-1).pos_inicial + "," + datos.get(datos.size()-1).pos_final + "]");
            else if(zero == false)
                System.out.println(cadena_numeros.length +" -> [0," + (cadena_numeros.length - 1)+"]") ;
        }
    }
}

class almacenador2  {

    public int pos_inicial;
    public int pos_final;
    public int multiplicacion;
    public int contador;

    public almacenador2(int pos_inicial, int pos_final, int multiplicacion, int contador) {
        this.pos_inicial = pos_inicial;
        this.pos_final = pos_final;
        this.multiplicacion = multiplicacion;
        this.contador = contador;
        
    }

    @Override
    public String toString() {
        return "almacenador2{" + "pos_inicial=" + pos_inicial + ", pos_final=" + pos_final + ", multiplicacion=" + multiplicacion + ", contador=" + contador + '}';
    }
    
    

}

class ComparadorDePrueba implements Comparator<almacenador2>{
    
    @Override
    public int compare(almacenador2 a, almacenador2 b)
    {
        return a.multiplicacion - b.multiplicacion;
    }
    
}


