class Student {
    String name;
    static String school;

    public static void changeSchool(){
        school = "newSchool";
    }
}
public class static_java {
    public static void main(String[] args) {
        Student.school = "NITK27"; //usually we used to do like-> first we create the object then access the function but for static we can directly access the fun/var
        Student student1 = new Student();
        student1.name="Humpy";
        System.out.println(student1.school);
    }
}
