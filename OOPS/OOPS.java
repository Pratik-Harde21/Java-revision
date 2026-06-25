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
    String name;
    int age;

    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
    Student(){ //non-parametrised constructor
        System.out.println("Constructor called");
    }

    Student(String name, int age){ //non-parametrised constructor
        this.name = name;
        this.age = age;
    }

    //Copy constructor
    Student(Student s2){
        this.name = s2.name;
        this.age = s2.age;
    }
}


public class OOPS {
    public static void main(String[] args) {
        // Pen pen1 = new Pen();  //creating object of pens
        // pen1.color = "Blue";
        // pen1.type = "Gel";
        // pen1.write();
        // pen1.printColor();

        // Pen pen2 = new Pen();
        // pen2.color = "Black";
        // pen2.type = "Ballpoint";
        // pen2.write();
        // pen2.printColor();
        

        //Constructor --> class name and constructor name should be same
                 //   --> COnstructor will not return anything
        // Student s1 = new Student();   //Object creation
        // s1.name = "Atharva"; 
        // s1.age = 17;
        // s1.printInfo();

        // Parameterised Constructor
        // Student s2 = new Student("Pratik",25);   //Object creation
        // s2.printInfo();

        // Copy constructor
        Student s1 = new Student();
        s1.name = "Ibin";
        s1.age = 25;
        Student s2 = new Student(s1);
        s2.printInfo();
    }
}