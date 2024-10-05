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
        for (double score : testScores) {
            total += score;
        }
        return total / testScores.length;
    }

    // Method to determine the grade based on the average
    public char determineGrade() {
        double average = calculateAverage();
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
        System.out.println("Student Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Average Score: " + calculateAverage());
        System.out.println("Grade: " + determineGrade());
    }

    // Main method to test the Student class
    public static void main(String[] args) {
        // Creating a Student object
        Student student = new Student("Alice", 20, 85.5, 92.0, 78.5);
        
        // Displaying student information
        student.displayInfo();
    }
}
