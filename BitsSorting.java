import java.util.*;
public class BitsSorting{
    public static void main(String[] args){
        // int n = 5;//101
        // int pos = 3;
        // int bitmask = 1<<pos;
        // if((bitmask & n) == 0){
        //     System.out.println("The bit was zero");
        // }else{
        //     System.out.println("The bit was one.");
        // }

        //Sorting
        int arr[] = {1,8,7,3,2};
        //Bubble Sort
        for(int i=0; i<arr.length-1; i++){//n-1
            for(int j=0; j<arr.length-i-1; j++){
                if(arr[j] > arr[j+1]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println(arr);
    }
}