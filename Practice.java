import java.util.Scanner;
public class Practice {
    public static void main (String[]args){
        System.out.println("Enter any number between 1 to 7:");
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        switch(day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;  
            default:
                System.out.println("wed- sun");

            
        }
    }
    
}
