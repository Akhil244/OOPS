import java.util.*;

class Inheritancedemo{

    /* Inheritance is defined as parent child relationship (is-a relation)

     here a child can accces and call the parent method but parent cant access the child methods
 
     there are 4 types of inheritance:

     1) simple inheritance
     2) multi level inheritance
     3) multiple inheritance (not supported by java but we can implement it using interfaces)
     4) hierarchial inheritance
     a child can accces the parent method but parent cant access the child methods

     it can be done using abstract classes 
     
    */

   // lets implement simple inheritance 

    static class Student{   // parent class

        public void mark(){
            System.out.println("attendance marked");
        }

    }

    static class Enggstud extends Student{ // child class

        public void labs(){
            System.out.println("labs marked");
        }
    }

    // for hierarchial inheritance 
    /* 
        it follows this structure (B and C both extend A)
                 A
                / \
               B   C 
     */
    // lets add this for hierarchial inheritance

    static class Medicalstud extends Student{
        void labs(){
            System.out.println("Attended medical labs");
        }
    }

    // multiple inheritance can be implemented by us but its not recommended because of diamond problem 

    // multiple inheritance is the reverse of hierarchial inheritance
    /*      
        A   B  (parents to C)
         \ /
          C
    
    diamond problem is class trying to extend multiple classes having the same method
    in the above case its A and B having the same method and C trying to inherit both at same time
    creating confusion on what method to access

    Note : if you add the keyword final to any class -> child classes cannot inherit that particular class
    */

    public static void main(String args[]){
        
        Student s=new Student();

        s.mark(); // can only mark but cant attend labs 

        Enggstud e=new Enggstud();

        e.mark();
        e.labs(); // can mark as well as attend lab

        Medicalstud md=new Medicalstud();

        md.mark();
        md.labs(); // calls its own lab not engg stud labs cuz of hierarchial inheritance

    }
}