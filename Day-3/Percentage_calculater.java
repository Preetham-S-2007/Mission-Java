import java.util.Scanner;

public class Percentage_calculater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total marks: ");
        float totalMarks = sc.nextFloat();
        System.out.println("Enter the 5 subject marks: ");
        float subject1 = sc.nextFloat();
        float subject2 = sc.nextFloat();
        float subject3 = sc.nextFloat();
        float subject4 = sc.nextFloat();
        float subject5 = sc.nextFloat();
        float obtainedMarks = subject1 + subject2 + subject3 + subject4 + subject5;
        float percentage = (obtainedMarks / totalMarks) * 100;
        System.out.println("The percentage is: " + percentage + "%");
        sc.close();
    }
}
