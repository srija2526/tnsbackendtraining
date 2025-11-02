class Student{
    int rollno;//Instance variable
    String branch;
    String name;
    static String collegename="Avn";//static variable
    void print(){
        String mesg="These are tns students";//local variable
        System.out.println(mesg);
        System.out.println("The student is\t"+name+ "\tbearing rolln\t" +rollno+ "from branch\t" +branch);
    }
}
//executor class for studentclass.
public class Studentmain {
    public static void main(String[] args) {
        Student s=new Student();
        s.rollno=23;
        s.branch="cse";
        s.name="saisrija";
        s.print();
        System.err.println(Student.collegename);

    }
    
}
