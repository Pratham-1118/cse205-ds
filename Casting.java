public class Casting {
    public static void main(String[] args) {
        double price = 100.00;
        double finalPrice = price + 18; // Implicit casting.

        System.out.println(finalPrice);
        // Glass to bucket but not bucket to glass, same way int to double but not
        // double to int.
        int p = 100;
        int fp = p + (int) 18.98; // Explicit casting.
        System.out.println(fp);
        // The conversion of data type from int to double is done java itself and is
        // known inplicit casting.
        // Contants- Are which we want them to remain constant throughout the code.
        int age = 30;
        age = 32;
        age = 34;

        // float PI = 3.142F;
        // PI = 3.152F; // Value changes.
        final float PI = 3.14F;
        // PI = 3.1F; Constants or final value contants are assigned with capital
        // letters.
        // Operators
        // int a = 4;
        // int b = 5;
        // int div = a/b;
        // System.out.println(div);
        double a = 4;
        double b = 5;
        double div = a / b;
        System.out.println(div);
        // = is a assignment operator.
        int numb = 2;
        numb++;
        System.out.println(numb);

        // Math class
        System.out.println(Math.max(5, 6));
        System.out.println((int) (Math.random() * 100));

    }

}
