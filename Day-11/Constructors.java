class MyMainEmployee{
    
    private int id;
    private String name;

    public MyMainEmployee(){
        id = 50;
        name = "Robert";
    }

    public MyMainEmployee(String myName, int myId){
        id = myId;
        name = myName;
    }

    public int getId() {return id;}
    public void setId(int i) {this.id = i;}
    public String getName() {return name;}
    public void setName(String n) {this.name = n;}
}

public class Constructors{
    public static void main(String[] args) {
        MyMainEmployee emp = new MyMainEmployee();

        // emp.setId(22);
        // emp.setName("Preetham");

        System.out.println(emp.getId());
        System.out.println(emp.getName());
    }
}