import java.util.Scanner;

public class TakingInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input your name:");
        String name = sc.nextLine();
        System.out.println(name);
        System.out.println("Enter your age:");
        int age = sc.nextInt();
        System.out.println(age);
        if (age > 18) {
            System.out.println("The person is eligible to vote.");
        } else {
            System.out.println("The person is not eligible to vote.");
        }
        int a = 12;
        int b = 23;
        if (a < 50 && b < 50) {
            System.out.println("Both are less than 50");
        }
        // ||- Logical or operator
        boolean isAdult = true;
        if (!isAdult) { // WIll check = False.
            System.out.println("Is adult");
        } else {
            System.out.println("not an adult");
        }
        // Conditional statements _ Switch
        System.out.println("Enter any number between 1 to 7:");
        int day = sc.nextInt();
        switch (day) {
            case 1:
                System.out.println("Monday");
                // break; Instead it will print all the values after the matched one.
            case 2:
                System.out.println("Tuesday");
                // break;
            default:
                System.out.println("wed- sun");

        }

    }
}