import java.util.Scanner;
public class Student {
    // Instance variables
    private String name;
    private int age;
    private double[] testScores = new double[3];
    // Constructor
    public Student(String name, int age, double score1, double score2, double score3) {
        this.name = name;
        this.age = age;
        this.testScores[0] = score1;
        this.testScores[1] = score2;
        this.testScores[2] = score3;
    }
    // Method to calculate the average score
    public double calculateAverage() {
        double total = 0;
        for (double score : testScores) {  // Using instance variable testScores
            total += score;
        }
        return total / testScores.length;
    }
    // Method to determine the grade based on the average
    public char determineGrade(double average) {  // Pass the average as a double
        if (average >= 90) {
            return 'A';
        } else if (average >= 80) {
            return 'B';
        } else if (average >= 70) {
            return 'C';
        } else if (average >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }
    // Method to display student details
    public void displayInfo() {
        double studentAve = calculateAverage();
        char studentGrade = determineGrade(studentAve);  // Determine grade based on average
        System.out.println("Student Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Average Score: " + studentAve);
        System.out.println("Grade: " + studentGrade);
    }
    // Main method to test the Student class
    public static void main(String[] args) {
        // Creating a Student object
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the student name: ");
        String studentName = scanner.nextLine();
        System.out.print("Enter the student aga: ");
        int studentAge = scanner.nextInt();
        System.out.print("1st grade: ");
        int grade1 = scanner.nextInt();
        System.out.print("2nd grade: ");
        int grade2 = scanner.nextInt();
        System.out.print("1rd grade: ");
        int grade3 = scanner.nextInt();
        Student student = new Student(studentName, studentAge, grade1, grade2, grade3);
        scanner.close();
        student.displayInfo();  
    }
}


// Explanation:
// 1. The program defines a `Student` class with instance variables for the student's name, age, and an array to hold three test scores.
// 2. The constructor takes the student's name, age, and three test scores as parameters and assigns them to the instance variables.
// 3. The `calculateAverage()` method computes the average of the three test scores by iterating through the `testScores` array and dividing the total by the length of the array.
// 4. The `determineGrade()` method takes the calculated average as a parameter and returns a grade ('A', 'B', 'C', etc.) based on predefined thresholds.
// 5. The `displayInfo()` method outputs the student's name, age, average test score, and the corresponding grade.
// 6. In the `main` method, a `Scanner` object is created to accept input from the user for the student's name, age, and three test scores.
// 7. After gathering the input, the `Student` object is created with the provided values.
// 8. The `displayInfo()` method is called to display the student's information, including the calculated average and grade.
// 9. The `Scanner` object is closed to avoid memory leaks.