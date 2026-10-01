public class practice{
    public static void main(String[] args){
        //To print the weird star pattern
        int n=5;
        for(int i=n;i>0;i--){
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }

        //Sum of first n even numbers with while loop
        int m=0;
        int sum=0;
        while(m<=10){
            if(m%2==0){
                sum+=m;
            }
            m++;
        }
        System.out.println("Sum of first 10 even numbers: " + sum);
    }
}