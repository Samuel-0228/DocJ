public class JavaSummary {
    public static void main(String[] args) {
        // VARIABLES & DATA TYPES
        String name = "Abebe";
        int age = 20;
        double gpa = 3.85;
        boolean isStudent = true;
        char grade = 'A';
        
        // PRINT WITH OPERATORS (+ for concat)
        System.out.println("Name: " + name);
        System.out.println("Age: " + age + ", GPA: " + gpa);
        System.out.println("Student? " + isStudent + ", Grade: " + grade);
        
        // ARITHMETIC OPERATORS
        int x = 10, y = 3;
        System.out.println("10 + 3 = " + (x + y));  // 13
        System.out.println("10 / 3 = " + (x / y));  // 3 (truncates)
        System.out.println("10 % 3 = " + (x % y));  // 1
        
        // IF STATEMENTS
        if (age >= 18) {
            System.out.println("✅ Adult");
        } else {
            System.out.println("❌ Minor");
        }
        
        if (gpa >= 3.5) {
            System.out.println("Excellent GPA!");
        } else if (gpa >= 3.0) {
            System.out.println("Good GPA!");
        } else {
            System.out.println("Needs improvement.");
        }
        
        // FOR LOOP
        System.out.print("Numbers 1-5: ");
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        
        // WHILE LOOP
        System.out.print("Countdown: ");
        int count = 5;
        while (count > 0) {
            System.out.print(count + " ");
            count--;
        }
        System.out.println();
        
        // MIXED EXAMPLE
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;  // += shortcut
        }
        if (sum == 55) {
            System.out.println("✅ 1+2+...+10 = " + sum);
        }
    }
}
