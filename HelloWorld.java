import java.util.Scanner;
public class HelloWorld{
    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.print("HelloWorld");
        int ab =12;
        float pi= 3.14F;
        System.out.println(ab);
        byte age = 14; 
        long cse =32324656456L  ;
        char letter = '@';
        boolean isadult = false;
        System.out.println(cse);
        // Non primitive type.
        String name = "Panchal";
        String name1= "Harsh";
        System.out.println(name.length());
        String name2 = name1 + "N" +  name;
        System.out.println(name2);
        // System.out.println(name.charAt(4));
        // String place = name.replace(oldChar: 'a', newChar: 'b');
        // System.out.println(place); 
        // Strings in java are immutable. Now if we simply print name then it will the original one. So for new one we have to create a complete new string.
        System.out.println(name.substring(0, 4));
        if (8<4){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
        System.out.println(name2.substring(2,5));
        Scanner sc = new Scanner(System.in);
        System.out.println("Input your age:");
        // int agee = sc.nextInt();
        int agee = sc.nextInt();
        System.out.println(agee);
        System.out.println("Enter your friend's name : ");
        String frnd = sc.next();
        System.out.println(frnd);
        System.out.println("Input your thought: ");
        String thought = sc.nextLine();
        System.out.println(thought);
        //Operators.
        boolean isSunup = true;
        if(isSunup == false){
            System.out.println("Night");
        }else{
            System.out.println("Day");
        }
        boolean isAdult = true;
        if(!isAdult){
            System.out.println("Is adult");
        }else{
            System.out.println("not an adult");
        }
//         import java.util.Scanner;
// class Conditions{
//     public static void main(String[] args){
//         // pen =10 and notebook =40
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the amount you have:");
//         int cash = sc.nextInt();
//         if(cash <10){
//             System.out.println("You cannot buy anything");
//             System.out.println("Get more cash");
//         }else if(cash >10 && cash <40){
//             System.out.println("You can only buy a pen");
//         }else{
//             System.out.println("Now you can buy both, book and a pen");
//         }
        
//     }
// }
        int[] result = new int[3];
        result[0] = 97;
        result[1] = 98;
        result[2] = 95;
        System.out.println(result[2]);
        

    }
}
