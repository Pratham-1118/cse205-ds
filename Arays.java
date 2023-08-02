import java.util.Arrays;
import java.util.Scanner;

class Student{
    public int roll_no;
    public String name;
    Student(int roll_no, String name)
    {
        this.roll_no = roll_no;
        this.name = name;
    }
}

public class Arays {
    public static void main(String[] args){
        Student[] arr;

        arr = new Student[5];

        arr[0] = new Student(1, "Pratham");
        arr[2] = new Student(3, "Alok");
        arr[1] = new Student(2, "Prince");
        arr[3] = new Student(4, "Het");
        arr[4] = new Student(5, "Meet");

        for(int i =0; i<arr.length; i++){
            System.out.println("Element at position" + i + "is:" + arr[i].roll_no + arr[i].name);
        }
    }

//     public static void main(String[] args) {
//         System.out.println("Hello, World!");
//         int[] marks = new int[3];
//         marks[0] = 97;
//         marks[1] = 95;
//         marks[2] = 98;
//         Scanner sc = new Scanner(System.in);
//         // Length
//         System.out.println(marks.length);
//         System.out.println(marks[1]);
//         Arrays.sort(marks);
//         System.out.println(marks[1]);
//         // int[] result = {95, 93, 95};
//         // // 2D Arrays.
//         // int[][] finalResult ={{95, 95, 93},{93, 94, 93}};
//         // System.out.println(finalResult[0][0]);
//         // Casting
//         System.out.println("Enter the size of array:");
//         int size = sc.nextInt();
//         int number[] = new int[size];
//         for(int i = 0; i<size; i++){
//             System.out.println("Enter elements of the array:");
//             number[i] = sc.nextInt();
//         }
//         for(int i = 0; i<size; i++){
//             System.out.println(number[i]);
            
//         }       
//     }
}