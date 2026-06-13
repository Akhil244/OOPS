import java.util.*;

class Oops{

    //implementing classes and objects in java using a custom example 
    //considering the real world use case of storing the data of student for any university

    /* to do this task 

    1. create a class of student
    2. define the characteristics of student inside it ex: name,rno,clg,marks,etc
    3. define the behaviour of the student describing what he is allowed to do 
    eg: he is allowed to check the attendance of any class etc
    4.printing the relevant detaikls of the student 

    */

   static class Student{

      //characteristics of student
      String name;
      int age;
      int rno;
      int atd;
      String clg;

      // behavior methods
      void markattendance(){
         System.out.println("the attendance of the student is:"+atd);
      }

      void print(){
        System.out.println(name+ " " + age+ " "+rno+" "+ atd+ " "+clg);
      }

      // instead of manually assigning the values of the characteristics of the class inside main 
      // we can make use of constructors to minimize the complexity of the code 

      /*

      constructor is use to initialize the values of the objects that are defined inside the class 
      we can specify the default values of a particular class by defining our default constructor

      Note: defining a constructor is recommended or mandatory to store the values of the instance variables
      if we dont create the default constructor java automatically creates the default constructor 
      and it initializes the values inside the instance variables (default values inside instance variable)
      */

     // creating our default constructor
     Student(){
        name="Akhil";
        age=21;
        rno=101;
        clg="IIT Bombay";
     }

     // we can do it even better way using parameterized constructor
     // constructor also provides overloading that is same method but different parameters
     /*
     withot this keyword:
     Student(String n,int a,int r,String c){
        name=n;
        age=a;
        rno=r;
        clg=c;
     }
     */

     // what if the variable naming of the constructor is same as the instance variable 
     // to differentiate we need to use the keyword this
     /* 
      1. It points to the instance object or current object
      2. we can use this(params_of_constructors); to call the other constructor inside one constructor
     */

     Student(String name,int age,int rno,String clg){
       this.name=name;
       this.age=age;
       this.rno=rno;
       this.clg=clg;
     }

     Student(String name,int age){
        this.name=name;
        this.age=age;
     }

     // we can perform constructor chaining bty calling one constructor with one parameter set 
     // inside another  with slightly more params using this keyword

     Student(String name,int age,int rno){
        // calling another constructor
        this(name,age,rno,"MVSR");
     }

   }

    public static void main(String args[]){
            
        // System.out.println("Implementing various things present in OOPS");

        //creating the object of the real world instance that is class

        // default constructor calling
        // Student s1=new Student();

        // calling parameterized constructor
        Student s=new Student("coder army",40,102,"mvsr");
        Student s1=new Student("Akhil",30);
        Student s2=new Student("akash",30,101);
        

        // s1.name="Akhil";
        // s1.rno=55;
        // s1.age=21;
        // s1.clg="IIT Bombay";
        // s1.atd=90;
        
        // //creating another student

        // Student s2=new Student();

        // s2.name="Akash";
        // s2.rno=54;
        // s2.age=21;
        // s2.clg="IIT Madras";
        // s2.atd=60;
        
        // instead of manually defining the fileds like above we can directly print the values

        s1.print();
        s.print();

        s2.print();
        
    }
}