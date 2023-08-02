import java.util.Scanner;
import java.util.Arrays;
public class TDArraysQ {
    public static void main(Stiring[] args){
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int[][] numbers = new int[rows][cols];
        for(int i = 0; i<rows; i++){
            for(int = 0;j<cols; j++){
                numbers[i][j] = sc.nextInt(); 
            }
        }

        for(int i = 0; i<rows; i++){
            for(int = 0;j<cols; j++){
                System.out.println(numbers[i][j] + " ");
            }
        }    
    }
    
}
