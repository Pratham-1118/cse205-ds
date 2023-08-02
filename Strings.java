import java.util.*;
public class Strings {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        //Strings are immutable.
        //String name = sc.next();
        String name = sc.nextLine();
        System.out.println("Your name is " + name);
        //Concatenation
        //Compare - Compare three basics criteria. Use this while comparing. Dont go for == as they not always correct.
        //1. s1>s2 : +ve value
        //2. s1=s2 : 0
        //3. s1<s2 : -ve value
        //hello and cello for same length 
        String name1 = "Tony";
        String name2 = "Stark";
        if(name1.compareTo(name2) == 0){
            System.out.println("The strings are equal.");
        }else{
            System.out.println("The strings are unequal.");
        }
        if(new String("Tony") == new String("Tony")){
            System.out.println("The strings are equal.");
        }else{
            System.out.println("The strings are not equal.");
        }
        //SUbstring
        String marvel = "Tony";
        String name3 = marvel.substring(2, marvel.length());
        System.out.println(name3);


        StringBuilder sb = new StringBuilder("Tony");   
        System.out.println(sb);
        System.out.println(sb.charAt(0));

        //setCharAt = to replace any word or character
        sb.setCharAt(0, 'P');
        System.out.println(sb);

        //Insert
        sb.insert(0, 'S');
        System.out.println(sb);

        sb.insert(3, 'n');
        System.out.println(sb);

        //To delete extra character.
        // sb.delete(2, 3);
        sb.delete(2, 4);
        System.out.println(sb);

        //Append- To add any charecter at the end of the string. This stringbuilder reduces the time for the folowing tasks
        sb.append("P"); //str = str + "P"
        sb.append("R"); //str = str + "R"
        System.out.println(sb);
        
        for(int i = 0; i<sb.length()/2; i++){
            int front = i;
            int back = sb.length() - 1 -i;

            char frontChar = sb.charAt(front);
            char backChar = sb.charAt(back);

            sb.setCharAt(front, backChar);
            sb.setCharAt(back, frontChar);  
        }
        System.out.println(sb);
    }
    
}
