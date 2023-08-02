public class Recursions {
    // public class void printSum(int i, int n, int sum){
    //     if(int i = n){
    //         System.out.println(sum);
    //         return;
    //     }
    //     sum += i;
    //     printSum(i+1, n, sum);
    // }

    // public static void main(String[] args){
    //     printSum(1, 5, 0);
         
    // }
    public static void printPermutation(String str, int idx, String perm) {
       if(str.length() == 0) {
           System.out.println(perm);
           return;
       }
      
       for(int i=0; i<str.length(); i++) {
           char currChar = str.charAt(i);
           String newStr = str.substring(0, i) + str.substring(i+1);
           printPermutation(newStr, idx+1, perm+currChar);
       }
   }
   public static void main(String args[]) {
       String str = "abc";
       printPermutation(str, 0, "");
   }
}
    // It is the function which call itself.
//      public static void printN(int n){
//         if (n == 0){
//             return;
//         }
//         System.out.println(n);
//         printN(n-1);
//      }

//      public static void main(Strings[] args){
//         int n = 1;
//         printN(n);

//      }
//     public static void printSum(int i, int n, int sum){
//         if(i == n){
//         sum += i;
//         System.out.println(sum);
//         return;
//         }
//         sum += i;
//         printSum(i+1, n, sum);
//         System.out.println(i);
//     }

//     public static void main(String[] args){
//         printSum(1, 5, 0);
//     }
// }
