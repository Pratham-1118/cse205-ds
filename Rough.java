import java.util.Scanner;

public class Rough {
    public static void printJava() {// Here in the parenthesis we take input for the method.
        System.out.println("Hello Java");
    }

    public static void printName(String name) {
        System.out.println(name);
    }

    public static void printSum(int a, int b) {
        int sum = a + b;
        System.out.println(sum);
    }

    public static void main(String[] args) {

        printJava();
        printJava();
        printName("PrinceSexy");
        printName("Kamli");
        printSum(6, 5);
        // String p = "Prince is sexy";
        // String k = "Butter is Buddy";
        // String P = p + " . " + k;
        // System.out.println(P);
        Scanner input = new Scanner(System.in);
        // System.out.println("Enter your name:");
        // String H = input.next();
        // System.out.println(H);
        int sum = 0;
        // for(int i =1; i<=10; i++){
        // sum = sum + i;
        // System.out.println(sum);
        // }System.out.println(sum);

    }

}
