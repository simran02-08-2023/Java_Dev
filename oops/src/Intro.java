public class Intro {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.name="Simran";
        s1.age=21;
        s1.rollno=174;
        s1.college="KIPM";
        Student s2=new Student();
        s2.name="Pragya";
        s2.age=20;
        s2.rollno=110;
        s2.college="KIPM";
        s1.markAttendance();
        s2.markAttendance();
        s1.print();
        s2.print();

    }
}
class Student{
    int age;
    String name;
    int rollno;
    String college;

    void markAttendance(){
        System.out.println("Attendance Marked "+name);
    }
    void print(){
        System.out.println(name+", "+age+", "+rollno+", "+college);
    }
}
