import java.util.Scanner;
import java.util.Arrays;

import javax.sound.sampled.SourceDataLine;

public class Index {
    
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();
    int number[] = new int[size];
    for(int i =0; i<size; i++){
        System.out.println("Enter elements of the array:");
        i = sc.nextInt();
    }
    int j = sc.nextInt();
    for(i =0; i<number.length; i++){
        if(number[i] == j ){
            System.out.println(i);
        }
    }
    

}
