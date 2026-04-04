public class TestEnrollment {
 public static void main(String[] args) {

 System.out.println("Initial Enrollment: " + Student.enrollmentCount);

 Student s1 = new Student("Aman Tadesse", 5001, 3.9);
 Student s2 = new Student("Hana Kebede", 5002);

 s1.displayInfo();
 s2.displayInfo("New Student Profile");
 System.out.println("Total Enrollment: " + Student.enrollmentCount);
 }
} 
