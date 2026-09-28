import java.util.Scanner;
public class Strings {
    public static void main(String[] args) {
        // String name = new String("Preetham");
        // System.out.print("The name is: ");
        // System.out.print(name);
        int a = 10;
        float b = 26.36f;
        System.out.printf("The value of a is %d and the value of b is %.2f", a, b);
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        System.out.println("The string is: " + st);
        sc.close();
    }
}
