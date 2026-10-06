class Employee{
    int id;
    String name;
    int salary;
    public void display(){
        System.out.println(id + " " + name + " " + salary);
    }
}

public class custom_class {
    public static void main(String[] args) {

        System.out.println("This is our Custom Class");

        Employee Preetham = new Employee(); // Instantiaing a new Employee object.
        Employee Goggins = new Employee();
        
        Preetham.id = 22;
        Preetham.salary = 100000;
        Preetham.name = "Preetham";
        Preetham.display();
        
        Goggins.id = 14;
        Goggins.salary = 150000;
        Goggins.name = "Goggins";
        Goggins.display();
    }
}