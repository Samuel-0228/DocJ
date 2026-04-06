package iheritance;

public class inheritance{
    public static void main(String[] args){
        student s = new student();

        System.out.println("Name: "+ s.name);
        System.out.println("Age: " + s.age);

        s.displayinfo();
    }
}