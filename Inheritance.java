// class Shape{
//     String color;
//     String parameter;
// }
// class Triangle extends Shape {

// }


// public class Inheritance {
//     public static void main(String[] args){
//         Triangle T1 = new Triangle();
//         T1.color = "Red";
//         T1.parameter = "Length and breadth";

//     }
// }
//Four types of inheritance: Single level inheritance.
// Class Shape
class shape{
    public void area(){
        System.out.println("Display area.");
    }
}
class triangle extends shape{
    public void area(int l, int h){
        System.out.println(1/2*l*h);
    }
}
class EquiTriangle extends triangle{
    public void area(int l, int h){
        System.out.println(1/2*l*h);
    }
}
