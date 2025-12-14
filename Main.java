    class Student {
String name;
int age;
public void display(){
    System.out.println("Name of the student: "+name+"  and Age: "+age);
}
    }
public class Main{
    public static void main(String[] args) {
        Student s1= new Student();
    s1.name="Sai dhatha";
    s1.age=20;
    s1.display();
    Student s2 = new Student();
    s2.name="lokesh";
    s2.age=20;
    s2.display();
            }
    }
class student{
String name;
int age;
public student(String name, int age){
    this.name=name;
    this.age=age;
}
public void display(){
    System.out.println("Name of the student:"+name+"  and Age:"+age);
}
public class Main{
    public static void main(String[] args) {
        student s1= new student ("Sai dhatha ",20);
        s1.display();
            }
    }}