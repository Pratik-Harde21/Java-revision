//--------------Blueprint of Pen-------------------------------------
//classes name stert with capital letters and functions name start with small letter
class Pen{
    String color;
    String type; //ballpoint/jel

    public void write(){
        System.out.println("Writing something: " + type);
    }
    
    public void printColor(){
        System.out.println(this.color);
    }
}

class Student {

}


public class OOPS {
    public static void main(String[] args) {
        Pen pen1 = new Pen();  //creating object of pens
        pen1.color = "Blue";
        pen1.type = "Gel";
        pen1.write();
        pen1.printColor();

        Pen pen2 = new Pen();
        pen2.color = "Black";
        pen2.type = "Ballpoint";
        pen2.write();
        pen2.printColor();
    }
}