import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        //Result of the expression 7/4*9/2

        int a = 7/4*9/2;
        System.out.println(a); // ans = 4

        // Program to encrypt a grade by adding 8 to it. Decrpypt it to show the correct grade.

        char grade = 'B';
        grade = (char)(grade + 8);
        System.out.println(grade); // ans = J

        grade = (char)(grade - 8);
        System.out.println(grade); // ans = B

        //comparision operation for user enterd number is greater than the given number or not
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int x = sc.nextInt();
        System.out.println(x>8); // true or false
        sc.close();

        //the get answer of the following expression
        int v=20;
        int u=10;
        int b = 6;
        int s = 2;
        int result = (v*v - u*u)/(2*b*s);
        System.out.println(result); // ans = 12
    }
}
