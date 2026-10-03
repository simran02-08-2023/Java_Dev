public class chaining2 {
    public static void main(String[] args) {
        Stud s1=new Stud();
        Stud s2=new Stud("Rahul");
        Stud s3=new Stud("Rohan",12);
        Stud s4=new Stud("Riya", 13, 101);
        Stud s5=new Stud("Priya", 12, 102, "KIPM");
        System.out.println(s1.name+" "+s1.age+" "+s1.rollno+" "+s1.college);
        System.out.println(s2.name+" "+s2.age+" "+s2.rollno+" "+s2.college);
        System.out.println(s3.name+" "+s3.age+" "+s3.rollno+" "+s3.college);
        System.out.println(s4.name+" "+s4.age+" "+s4.rollno+" "+s4.college);
        System.out.println(s5.name+" "+s5.age+" "+s5.rollno+" "+s5.college);
    }
}
class Stud {
    String name;
    int age;
    int rollno;
    String college;
    Stud(){
        this("Unknown");
        System.out.println("1st constructor");
    }
    Stud(String name){
        this(name,0);
        System.out.println("2nd constructor");
    }
    Stud(String name, int age){
        this(name, age,0);
        System.out.println("3rd constructor");
    }
    Stud(String name, int age, int rollno){
        this(name, age, rollno, "Unknown");
        System.out.println("4th constructor");
    }
    Stud(String name, int age, int rollno, String college){
        this.name=name;
        this.age=age;
        this.rollno=rollno;
        this.college=college;
        System.out.println("5th constructor");
    }
}
