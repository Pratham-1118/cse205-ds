class Pen{
    int itemNo;
    int itemprice;
    Pen(int itemNo, int itemprice){
        this.itemNo = itemNo;
        this.itemprice = itemprice;
        System.out.println("This is a construtor class.");
    }
    String color;
    String type; // Ballpoint,gel
    public void write(){
        System.out.println("Write something.");
        System.out.println(this.color);
        System.out.println(this.type);

        pen ppp = new Pen(2, 4);
        
        ppp.
    } 
}


public class OOP {
    public static void main(String[] args){
        Pen pen1 = new Pen();
        pen1.color = "blue"; 
        pen1.type = "gel";
        Pen pen2 = new Pen();
        pen2.color = "Pink";
        pen2.type = "Ball";
        pen2.write();

        pen p1 = new Pen(202, 20);

        // pen1.write();
        
    }
    
}
