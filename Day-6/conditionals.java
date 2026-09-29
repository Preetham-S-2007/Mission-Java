public class conditionals{
    public static void main(String[] args){
        //If-else-elseif ladder
       int age =18;
       if(age>=18){
        System.out.println("You are eligible to drive");
       }
       else if(age>=60){
        System.out.println("You are eligible to drive.But Ride carefully");
       }
       else{
        System.out.println("You are not eligible to drive");
       }
       //Relational operators "AND"
    boolean a = true;
    boolean b = false;
    if(a&& b){
        System.out.println("Y");
    }
    else{
        System.out.println("N");
    }

    //Relational operators "OR"

    boolean c = true;
    boolean d = false;
    if(c || d){
        System.out.println("Y");
    }
    else{
        System.out.println("N");
    }
    }
}