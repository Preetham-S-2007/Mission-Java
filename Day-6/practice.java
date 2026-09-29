import java.util.Scanner;

public class practice{
    public static void main(String[] args){
        // Pass or fail in terms of precentage
        float m1,m2,m3;
        System.out.println("Enter three subeject marks");
        Scanner sc = new Scanner(System.in);
        m1 = sc.nextInt();
        m2 = sc.nextInt();
        m3 = sc.nextInt();

        float result = (m1+m2+m3)/3;
        System.out.printf("Percentage: %.2f%%\n",result);

        if(m1>33 && m2>33 && m3>33 && result>40){
            System.out.println("Pass");
        }
        else{
            System.out.println("Fail");
        }

        //To calculate a day in a week using switch case

        int day;
        System.out.println("Enter a number between 1 to 7: ");
        day = sc.nextInt();

        switch(day){
            case 1: System.out.println("Monday");break;
            case 2: System.out.println("Tuesday");break;
            case 3: System.out.println("Wednesday");break;
            case 4: System.out.println("Thursday");break;
            case 5: System.out.println("Friday");break;
            case 6: System.out.println("Saturday");break;
            case 7: System.out.println("Sunday");break;
                    
        }
        sc.close();
    }
}