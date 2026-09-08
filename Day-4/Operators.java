public class Operators{
    public static void main(String[] args){
        int a = 8;
        // int b = 10%a; // Modulus operator
        int b=10;
        b*=a; // Assignment operator
        System.out.println(b);
        System.out.println(b==a); // Relational operator
        System.out.println(b>a && b<a); // Logical operator
        System.out.println(b>a || b<a); // Logical operator
        System.out.println(4&5); // Bitwise operator

        // Increment and Decrement operator
        int i = 75;
        System.out.println(i++); // Post increment
        System.out.println(i); 
        System.out.println(++i); // Pre increment
        System.out.println(i); 

        char ch = 'a';
        System.out.println(++ch); 
    }
}