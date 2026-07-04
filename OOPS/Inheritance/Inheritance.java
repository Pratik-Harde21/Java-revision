import java.util.*;
import bank.*;

class Shape {
    String color;
}

class Triangle extends Shape {          //Single inheritance
    public void area(int l, int h){
        System.out.println((1/2)*l*h);
    }
}

class EquilateralTriangle extends Triangle{ //Multi level inheritance
    public void area(int l, int h){
        System.out.println((1/2)*l*h);
    }
}

class Circle extends Shape{ // Hierarchical inheritance bcz triangle and circle extends Shape class
    public void area(int r){
        System.out.println(3.14*r*r);
    }
}

public class Inheritance {
    public static void main(String[] args) {
        // Triangle t1 = new Triangle();
        // t1.color = "Red";
        // System.out.println(t1.color);
        
        bank.Account account1 = new bank.Account();
        account1.name = "customer1";
    }
}
