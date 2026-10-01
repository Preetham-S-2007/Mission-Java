public class Loops_in_array {
    public static void main(String[] args) {

       int [] marks = {90, 80, 70, 60, 50};
       System.out.println(marks.length);

    //    for(int i=0;i<marks.length;i++){
    //     System.out.println(marks[i]);
    //    }
    for(int element: marks){
        System.out.println(element);
       }
    }
}