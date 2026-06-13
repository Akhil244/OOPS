import java.util.*;

class Encapsulationdemo{

    // lets implement encapsulation using a real world example 

    /* 
      encapsulation is combnining the data and the behaviour driven methods of a particular class
      into a single capsule 

      writting normal data and behaviour methods attains 50% of encapsulation 

      to ensure that we get 100% encapsulation we need to use access modifiers 

      we mostly use private and public in our class or constructors or variables or methods 

      consider a bank account mangement system where the user is going  to perform the following 

      ops:
      
      (assume the balance of the customer is already present with the bank)

      1. deposit amt
      2. withdraw cash
    
    the customer is not permitted to make any kind of changes to the cash like changing balance on purpose

    we can perform by using the keyword private 

    and to ensure a fair access to perform ops like deposit or withdraw

    we can use behaviour driven methods which we can write inside our specified class

    private allows accessing of a particular instance to class level only nothng ourtside class can

    make changes or access any type of value 

    */

    // designing our custom bank account management system 
    // Note: this is a sample the original buisness logic contains so many validation and checks

    static class Bankaccount{
    
       private double bal;

       public void deposit(int amt){
         bal+=amt;
       }

       public void withdraw(int amt){
         if(amt<=bal){
            bal-=amt;
         }
       }
       public void print(){
           System.out.print(bal);
        }
    }

     public static void main(String args[]){

        Scanner sc=new Scanner(System.in);
         
         Bankaccount ba=new Bankaccount();

         System.out.println("enter your deposit: ");

         int de=sc.nextInt();

         ba.deposit(de);

         sc.nextLine();

         System.out.println("your bal is:");

         ba.print();

         System.out.println("enter withdraw amt: ");

         int wi=sc.nextInt();

         ba.withdraw(wi);

         System.out.println("your bal is:");

         ba.print();


     }
}