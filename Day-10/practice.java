//Square class.
class square{
    int side;
    public int area(){
        return side*side;
    }
    public int perimeter(){
        return 4*side;
    }
}
//Student class.
class Student{
    int rollno;
    String name;
    public void display(){
        System.out.println(rollno + " " + name);
    }
}

public class practice {
    public static void main(String[] args) {
        square sq = new square();
        Student st = new Student();
        st.rollno = 101;
        st.name = "Preetham";
        st.display();

        sq.side = 7;
        System.out.println("Area: " + sq.area());
        System.out.println("Perimeter: " + sq.perimeter());
    }
}