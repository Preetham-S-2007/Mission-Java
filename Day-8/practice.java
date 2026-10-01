public class practice{
    public static void main(String[] args){
        //array of 5 floats and calculate their sum.
        float[] numbers = {1.5f, 2.5f, 3.5f, 4.5f, 5.5f};
        float sum = 0;
        for(int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println("Sum of the array elements is: " + sum);

        //Program to find our whether a given number is present in an array or not.
        int[] arr = {10, 20, 30, 40, 50};
        int Find = 20;
        boolean found = false;
        for(int i = 0; i < arr.length; i++) {
            if(Find == arr[i]) {
                found = true;
            }
        }
        if(found) {
            System.out.println(Find + " is present in the array.");
        } 
        else {
            System.out.println(Find + " is not present in the array.");
        }
        
        //To calculate the average maeks from an array containing marks of all students in Physics using for-each loop.
        int[] marks = {100, 99, 77, 92, 88};
        float avg = 0f;
        for(int element:marks){
            avg += element;
        }
        avg /= marks.length;
        System.out.printf("Average marks in Physics: %.2f%n", avg);

        //Creaate a java prgram to add two matrices of size 2x3.

        int[][] a = {{1, 2, 3}, {4, 5, 6}};
        int[][] b = {{7, 8, 9}, {10, 11, 12}};
        int[][] c = new int[2][3];

        for(int i = 0; i < a.length; i++) {
            for(int j = 0; j < a[i].length; j++) {
                c[i][j] = a[i][j] + b[i][j];
            }
        }
        for(int i = 0; i < c.length; i++) {
            for(int j = 0; j < c[i].length; j++) {
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }
}