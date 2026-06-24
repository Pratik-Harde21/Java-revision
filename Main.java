

class Main {
    public static void main(String[] args) {
        //write your code here
        // System.out.println("Main.main()");
        // System.out.print("Hello World!!!!");

        //Variables
        // String name = "Pratik!!";
        // int age = 25;
        // System.out.println(name);
        // System.out.println(age);

        //byte - 1 [-128 to 127]
        //short - 2
        //int - 4
        //long - 8
        //float - 4
        //double - 8
        //char - 2
        //boolean - 1 true/false


        // byte age = 30; //not 300000 - out of range of byte
        // int phone = 123456789;
        // long phone2 = 12345678900L;
        // float pi = 3.14F;
        // char letter = '@';
        // boolean isAdult = true;

        //Non-primitive types
        //primitive data type have fixed range like byte, int, etc
        //Non-primitive type no range until memory exhausted
        String name1 = "Pratik";
        // String friend = new String("Atharva");
        // System.out.println(name1.length());
        // System.out.println(friend);
        // String name2 = "Atharva";
        // String name3 = name1 + " And " + name2;
        // System.out.println(name3);
        // System.out.println(name1.charAt(0));


        //---------------------------Exception Handling (TRY-CATCH)-------------------------------
        int[] marks = {12,57,1,50};
        // System.out.println(marks[5]);
        // System.out.println("The name is Pratik"); //this line will not print bcz there is error before
        try {
            System.out.println(marks[5]);
        } catch(Exception e){
            //do something after catching
        }
        System.out.println("The name is Atharva"); //now this line can print we have used eception handling

    }
}