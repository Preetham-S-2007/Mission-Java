public class practice{

    //Multiplication table
    static void table(int n){
        for(int i=1;i<=10;i++){
            System.out.printf("%d X %d = %d\n",n,i,n*i);
        }
    }

    //Weird pattern
    static int pattern(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        return 0;
    }

    //A recursive function to calculate sum of first n natural numbers
    static int sum(int n){
        if(n==1){
            return 1;
        }
        else{
            return n + sum(n-1);
        }
    }

    public static void main(String[] args) {
        table(5);
        pattern(5);
        System.out.println("The sum of first 7 natural numbers is: " + sum(7));
    }
}