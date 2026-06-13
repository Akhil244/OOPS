import java.util.*;

class Inheritancedemo{

    /* Inheritance is defined as parent child relationship (is-a relation)

     here a child can accces and call the parent method but parent cant access the child methods
 
     there are 4 types of inheritance:

     1) simple inheritance
     2) multi level inheritance
     3) multiple inheritance
     4) hierarchial inheritance
     a child can accces the parent method but parentr cant access the child methods

    */

   // lets implement simple inheritance 

    static class Student{   // parent class

        public void mark(){
            System.out.println("attendance marked");
        }

    }

    static class Enggstud extends Student{

        public void labs(){
            System.out.println("labs marked");
        }
    }

    public static void main(String args[]){
        
        Student s=new Student();

        s.mark(); // can only mark but cant attend labs 

        Enggstud e=new Enggstud();

        e.mark();
        e.labs(); // can mark as well as attend lab
    }
}