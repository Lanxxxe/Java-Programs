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
        // Displaying student information
        student.displayInfo();  // No arguments needed since we're using instance variables
    }
}
