import java.util.*;


class Staticdemo{

        // lets implement static keyword

        /* static is a keyword whch can be used to declare any instance at the class level specific only 
        for ex: if we try to design a university portal all students belonging to same clg that means 
        instead of creating clg mutiple times inside object instance
        we can make clg as static so that all the objects to single clg class refrence
        */
    static class Student{

        String name;
        int age;
        int rno;
        static String clg;

        Student(String name,int age,int rno){
            this.name=name;
            this.age=age;
            this.rno=rno;
        }
    }
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        String n = sc.nextLine();

        int a =sc.nextInt();

        int r =sc.nextInt();

        sc.nextLine(); // consuming the left over input buffer 

        Student s=new Student(n,a,r);

        String c = sc.nextLine();

        Student.clg=c;

        System.out.println(s.name+" "+s.age+" "+s.rno+" "+Student.clg);

        // demonstrating the use of static 

        Student s1 = new Student("Akhil",21,1);
        Student s2 = new Student("Ravi",22,2);

        Student.clg = "JNTUH";

        // now the shared variable which we declared as static will change now

        System.out.println(s1.name+" "+s1.age+" "+s1.rno+" "+s1.clg);

        System.out.println(s2.name+" "+s2.age+" "+s2.rno+" "+s2.clg);


    }
}