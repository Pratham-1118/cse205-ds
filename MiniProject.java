import java.util.Scanner;
public class MiniProject {
    public static void main(String[] args){
        //Mini Project
        Scanner input = new Scanner(System.in);
        int myNumber = (int)(Math.random()*100);
        int userNumber = 0;
        do{
            System.out.println("Guess any number :");
            userNumber = input.nextInt();

            if(userNumber == myNumber){
                System.out.println("Woohooo!!!!!Right Guess");
                break;
            }
            else if(userNumber < myNumber){
                System.out.println("The Your number is too small ");
            }
            else{
                System.out.println("Your number is too large");
            }

        }while(userNumber >=0);

    }
    
}
