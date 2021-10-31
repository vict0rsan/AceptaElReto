package volumen1;

import java.util.Arrays;
import java.util.Scanner;

public class problema180 { //PERFECT - ACCEPTED
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int cases = input.nextInt();
        int side1, side2, side3;

        for(int i = 0; i < cases; i++){
            side1 = input.nextInt();
            side2 = input.nextInt();
            side3 = input.nextInt();
            typeOfRectangle(side1, side2, side3);
        }
    }

    public static void typeOfRectangle(int side1, int side2, int side3){
        int [] triangleSides = new int[]{side1, side2, side3};
        Arrays.sort(triangleSides);

        if(triangleSides[0] + triangleSides[1] <= triangleSides[2])
            System.out.println("IMPOSIBLE");
        else if(Math.pow(triangleSides[0],2)+Math.pow(triangleSides[1],2) == Math.pow(triangleSides[2],2))
            System.out.println("RECTANGULO");
        else if(Math.pow(triangleSides[0],2)+Math.pow(triangleSides[1],2) > Math.pow(triangleSides[2],2))
            System.out.println("ACUTANGULO");
        else if(Math.pow(triangleSides[0],2)+Math.pow(triangleSides[1],2) < Math.pow(triangleSides[2],2))
            System.out.println("OBTUSANGULO");
    }
}
