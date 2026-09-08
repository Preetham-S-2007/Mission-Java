import java.util.Scanner;

public class Practice {
    //Sum of three numbers
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1: ");
        int num1 = sc.nextInt();
        System.out.println("Enter number 2: ");
        int num2 = sc.nextInt();
        System.out.println("Enter number 3: ");
        int num3 = sc.nextInt();
        int sum = num1 + num2 + num3;
        System.out.println("The sum of these numbers is: " + sum);

        //Program to calculate the CGPA of a student based on the marks obtained in 3 subjects

        System.out.println("Enter the marks for subject 1: ");
        float marks1 = sc.nextFloat();
        System.out.println("Enter the marks for subject 2: ");
        float marks2 = sc.nextFloat();
        System.out.println("Enter the marks for subject 3: ");
        float marks3 = sc.nextFloat();
        float totalMarks = marks1 + marks2 + marks3;
        float cgpa = totalMarks / 30;
        System.out.println("The CGPA of the student is: " + cgpa);
    
        // Program to ask user his/her name and greet him/her with his/her name

        System.out.println("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Hello, " + name + "! Welcome to the Java world.");

        // Program to convert kilometers to miles

        System.out.println("Enter the distance in kilometers: ");
        double kilometers = sc.nextDouble();
        double miles = kilometers * 0.621371;
        System.out.println(kilometers + " kilometers is equal to " + miles + " miles.");

        sc.close();
    }
}


