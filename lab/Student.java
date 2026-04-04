class Student {
 private String name;
private int id;
 private double gpa;

 public static int enrollmentCount = 0;

 public Student(String name, int id, double gpa) {
 this.name = name;
 this.id = id;
 this.gpa = gpa;
 enrollmentCount++; 
 }

 public Student(String name, int id) {
 this.name = name;
 this.id = id;
 this.gpa = 0.0;
 enrollmentCount++;
 }

 public void displayInfo() {
 System.out.println("ID: " + id + " | Name: " + name + " | GPA: " + gpa);
 }

 public void displayInfo(String header) {
 System.out.println("--- " + header + " ---");
 displayInfo();
 }
}