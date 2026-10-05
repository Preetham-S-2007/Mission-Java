public class var_args{

    static int sum(int ...arr){
        int result = 0;
        for( int a:arr){
            result += a;
        }
        return result;
    }

    public static void main(String[] args) {
       System.out.println("The sum of 6, 7, 8, and 9 is: " + sum(6,7,8,9));
    }
}