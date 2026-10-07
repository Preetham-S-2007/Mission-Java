class MyEmployee{
    
    private int id;
    private String name;

    public int getId() {
        return id;
    }
    public void setId(int i) {
        id = i;
    }
    public String getName() {
        return name;
    }
    public void setName(String n) {
        name = n;
    }
}

public class Access_Modifiers {
    public static void main(String[] args) {
        MyEmployee emp = new MyEmployee();  
        // emp.id = 101;
        // emp.name = "Preetham"; //Throws an error due to private access modifier.

        emp.setId(22);
        emp.setName("Preetham");
        System.out.println("Employee id: " + emp.getId());
        System.out.println("Employee name: " + emp.getName());
    }
}