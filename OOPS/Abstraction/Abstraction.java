// class Animal{          //here we are creating object of this Animal class bcz we will create object of Horse or Chicken not Animal so make it abstract
//     public void walk(){

//     }
// }

abstract class Animal{          //here we are creating object of this Animal class bcz we will create object of Horse or Chicken not Animal so make it abstract
    Animal(){
        System.out.println("You are creating a Animal");
    }
    abstract void walk();
    public void eat(){
        System.out.println("Animal eats");
    }
}

class Horse extends Animal {
    Horse(){
        System.out.println("Created a Horse");
    }
    public void walk(){
        System.out.println("Walk on 4 legs");
    }
}

class Chicken extends Animal{
    public void walk(){
        System.out.println("Walk on 2 legs");
    }
}

public class Abstraction {
    public static void main(String[] args) {
        Horse horse = new Horse();
        // horse.walk();
        // horse.eat();

        // Animal animal = new Animal(); //will throw error
        // animal.walk();
    }
}
