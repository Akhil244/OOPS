import java.util.*;

public class Method{

// method overloading has same method name signature but different parameters

    static int sum(int a,int b){
        return a+b;
    }


    static int sum(int a,int b,int c){
        return a+b+c;
    }

    // recursion: function calling itself 
    /* in order to implement recursion ourselves we need to ensure that:

    1. we have the base case for the particular problem to ensure that the fn() 
    isnt struck in an infinite loop of repeatedly calling itself without any way of exit

    2. after the base case the fn() will call itself until the base case becomes true or until the condn is present
    then we can safely return the final value based on the return type of the fn()

    */

    // recursive manner to implement printing nos from 1 to n

    static void print(int n){
        // base case 
        if(n==0){
            return; // the control shifts back to the last fn() that is fn(1)
        }
         print(n-1); 
         System.out.println(n);
    } 

    // there are two things in methods we can implenment in java
    /* 
    1. cal by value - we pass the variables directly 
    2. call by refrence -  we pass the refrence using objects
    */

   // call by value

   static void add(int x,int y){
     x+=10;
     y+=10;
     System.out.println(x);
     System.out.println(y);
   }

   // call by refrence

   static class Rand{
      
      static int x,y;

      Rand(int x,int y){
         this.x = x;
         this.y = y;
      }

      // behaviour methods
      static void add(Rand r){
         r.x+=10;
         r.y+=10;
      }

      void print(){
         System.out.println(x+" "+y);
      }
   }

    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);

        int a=sc.nextInt();        

        int b=sc.nextInt();

        Rand r1=new Rand(a,b);

        Rand.add(r1);

        r1.print();


        // int c=sc.nextInt();

        // int sum=sum(a,b);

        // int three=sum(a,b,c);

        // System.out.println(sum);
        
        // System.out.println(three);
        
        // int num=sc.nextInt();
        
        // print(num);

        // int x=sc.nextInt();        

        // int y=sc.nextInt();

        // add(x,y);
    }
}