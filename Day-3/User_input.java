import java.util.Scanner;

class User_input {
    public static void main(String[] args) {
        System.out.println("Hello, User!");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1: ");
        // int a = sc.nextInt();
        float a = sc.nextFloat();
        System.out.println("Enter number 2: ");
        // int b = sc.nextInt();
        float b = sc.nextFloat();
        // int sum = a + b;
        float sum = a + b;
        System.out.println("The sum of these numbers is: " + sum);
        // String str = sc.nextLine();
        // System.out.println(str);
        sc.close();
    }
}