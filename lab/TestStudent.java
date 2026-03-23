package et.edu.aau;
public class TestStudent{
 public static void main(String[] args){
 Student s=new Student();
 s.setFirstName("Abebe");
 s.setLastName("Kebede");
 s.setYear(4);
 System.out.println("Student details");
 System.out.println("First Name: "+s.getFirstName());
 System.out.println("Last Name: "+s.getLastName());
 System.out.println("Year: "+s.getYear());
 }
 }