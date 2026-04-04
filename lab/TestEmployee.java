public class TestEmployee {
 public static void main(String[] args) {
 Employee[] staff = new Employee[2];
 staff[0] = new FullTimeEmployee("Abebe");
 staff[1] = new PartTimeEmployee("Sara");
 for (Employee e : staff) {
 // specific to the actual object type
 System.out.println(e.name + " Salary: $" + e.calculateSalary());
 }
 }
}