public class Methods_Overloading{

    static void change(int a){
        a = 98;
    }
    static void change2(int[]  arr){
        arr[0] = 98;
    }

    static void foo(){
        System.out.println("Good Morning Bro!!");
    }
    static void foo(int a){
        System.out.println("Good Morning " + a + " Bro!!");
    }
    static void foo(int a,int b){
        System.out.println("Good Morning " + a + " Bro!!");
        System.out.println("Good Morning " + b + " Bro!!");
    }

    static void telljoke(){
        System.out.println("What the dog doin!!");
    }

    public static void main(String[] args) {
        // telljoke();

        //Changing the integer.
        // int x = 45;
        // change(x);
        // System.out.println(x);
        
        //Changing the integer.
        // int[] marks = {23,45,56,78};
        // change2(marks);
        // System.out.println(marks[0]);

        foo();
        foo(2200);
        foo(2200, 4000); 
        //Arguments are actual!!
    }
}