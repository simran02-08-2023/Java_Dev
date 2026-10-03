public class Chaining1 {
    public static void main(String[] args) {
       Stu s1=new Stu();
       Stu s2=new Stu("Rahul");
       Stu s3=new Stu("Rohan",12);
       Stu s4=new Stu("Riya", 13, 101);
       Stu s5=new Stu("Priya", 12, 102, "KIPM");
        System.out.println(s1.name+" "+s1.age+" "+s1.rollno+" "+s1.college);
        System.out.println(s2.name+" "+s2.age+" "+s2.rollno+" "+s2.college);
        System.out.println(s3.name+" "+s3.age+" "+s3.rollno+" "+s3.college);
        System.out.println(s4.name+" "+s4.age+" "+s4.rollno+" "+s4.college);
        System.out.println(s5.name+" "+s5.age+" "+s5.rollno+" "+s5.college);
    }
}
class Stu{
    String name;
    int age;
    int rollno;
    String college;
    Stu(){
        this("Unknown",0,0,"Unknown");
    }
    Stu(String name){
        this(name,0,0,"Unknown");
    }
    Stu(String name, int age){
        this(name, age,0,"Unknown");
    }
    Stu(String name, int age, int rollno){
        this(name, age, rollno, "Unknown");
    }
    Stu(String name, int age, int rollno, String college){
        this.name=name;
        this.age=age;
        this.rollno=rollno;
        this.college=college;
    }
}