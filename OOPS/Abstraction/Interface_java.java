interface Animal {
    // Animal(){   //it will throw error bcz Constructor are not possible of interfaces

    // }
    void walk();
    // void eat(){ //will throw error bcz inside interface non abstarct functions are not allowed

    // }
}

interface Herbivore {

}


class Horse implements Animal,Herbivore {  //in java multiple inheritance can be only achieved using interfaces
    public void walk(){
        System.out.println("Walks on 4 legs");
    }
}

public class Interface_java {
    public static void main(String[] args) {
        Horse horse = new Horse();
        horse.walk();
    }
}
