public class Constructors {
    public static void main(String[] args) {
        Employee e1=new Employee();// default constructor
        Employee e2= new Employee("Ram", 30000);
        System.out.println(e2.name+" "+ e2.salary);
        System.out.println(e1.name+" "+ e1.salary);
    }
}
class Employee{
    String name;
    int salary;
    // constructor overloading
    Employee(String name, int salary){
        this.name=name;       // parameterized constructor
        this.salary=salary;
    }
    Employee(){}
}