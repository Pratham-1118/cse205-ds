import javax.xml.transform.Source;
import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 100; i >= 1; i--) {
            System.out.println(i);
        }
        // We can declare i again as it is define within for loop.
        int i = 1;
        while (i <= 100) {
            System.out.println(i);
            i = i + 1;
        }

        int k = 1;
        do {
            System.out.println(k);
            k = k + 1;
        } while (k <= 20);

        int number;
        do {
            System.out.println("Enter a number:");
            number = sc.nextInt();
            System.out.print("Here us your number: ");
            System.out.println(number);
        } while (number <= 5);
        System.out.println("The End");
        // while (true) {
        // int p;
        // System.out.println(p);
        // i++;
        // if (l > 5) {
        // break;
        // }

        // }
        // Exception and errors are both different things. The code will run till the
        // exception arrives. While in the case of error the code itself will not run.
    }

}
