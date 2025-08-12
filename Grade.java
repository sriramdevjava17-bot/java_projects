
import java.util.Scanner;

class GradeCal {

    public void gradeCalculator(double i) {
        if (i < 40) {
            System.out.println("The grade of the marks you scored is F");
        } else if (i >= 40 && i < 50) {
            System.out.println("The grade of the marks you scored is E");
        } else if (i >= 50 && i < 60) {
            System.out.println("The grade of the marks you scored is D");
        } else if (i >= 60 && i < 70) {
            System.out.println("The grade of the marks you scored is C");
        } else if (i >= 70 && i < 80) {
            System.out.println("The grade of the marks you scored is B");
        } else if (i >= 80 && i < 90) {
            System.out.println("The grade of the marks you scored is A");
        } else if (i >= 90 && i <= 100) {
            System.out.println("The grade of the marks you scored is S");
        } else {
            System.out.println("Invalid marks");
        }

    }
}

public class Grade {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter number of Students: ");
            int students = sc.nextInt();
            int[] arr = new int[students];
            for (int i = 0; i < students; i++) {
                System.out.println("Enter marks of students " + (i + 1) + " :");
                arr[i] = sc.nextInt();
            }
            double sum = 0;
            for (int i = 0; i < students; i++) {
                sum += arr[i];
            }
            double marks = sum / students;
            System.out.println("Average marks: " + marks);
            GradeCal gc = new GradeCal();
            gc.gradeCalculator(marks);
        }
    }
}
