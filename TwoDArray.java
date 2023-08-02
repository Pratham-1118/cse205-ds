import java.util.Arrays;
import java.util.Scanner;
public class TwoDArray{
    public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            int rows  = sc.nextInt();
            int columns = sc.nextInt();
            int[][] numbers = new int[rows][columns];
        
            //Inputs
            for(int i = 0; i<rows; i++){
                for(int j = 0; j<columns; j++){
                    numbers[i][j] = sc.nextInt();
                }
            }
        
            for(int i=0; i<rows; i++){
                for(int j=0; j<columns; j++){
                    System.out.println(numbers[i][j] + " ");
                }
            }
        }
    }

