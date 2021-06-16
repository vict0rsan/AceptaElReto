

package volumen6; //POR COMPLETAR, NO SE COMO SE HACE

import java.util.*;



public class problema600 {  
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        while(true){
            
            boolean silla = false;
            
            int rows = s.nextInt();
            int col = s.nextInt();
            
            if(rows == 0 && col == 0)
                break;
            
            int [][] matrix = new int [rows][col];
            
            for(int i = 0; i < rows; i++){
                for(int j = 0; j < col; j++){
                    matrix[i][j] = s.nextInt();
                }
            }
            
            for(int i = 0; i < rows; i++){
                for(int j = 0; j < col; j++){
                    matrix[i][j] = s.nextInt();
                }
            }
            
            
        }
    }
    
}
