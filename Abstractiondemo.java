class Abstractiondemo{
    
    // Abstraction is hiding unneccessary details and showing only the required ones
    /* 
       there are 2 types:
       low level an high level abstraction 

       in low level we have what andhow methods tightly coupled 
       in high level we seperate what from how using combination of two things 

       1. inheritance
       2. absrtract classes and Interfaces
    */

   // implementing low level abstraction using normal classes 

   static class Student{
      
      void mark(){
        System.out.println("marked");
      }
   }

   static class Enggstud{
      void labs(){
        System.out.println("labs"); 
      }
   }


   // implementing high level abstraction 

   // lets consider the example of car 

   static abstract class Car{  // any class with abstract methods must be declared abstract
      
      //defining methods
      void brakes(){
        System.out.println("Applying brakes"); // this is common to both cars 
      }

      abstract void drive();  // declare it and then implement seperately based on the category of the car
      abstract void stop();
   }

   // using inheritance we can extend car to different types of vehicles 

   // we clearly seperated what to do from how to do based on the category of car

   static class Ec extends Car{
      void drive(){
        System.out.println("driving ev car");
     }
     void stop(){
        System.out.println("stopping ev car");
     }
   }

   static class Pc extends Car{
      void drive(){
        System.out.println("driving petrol car");
     }

     void stop(){
        System.out.println("stopping petrol car");
     }
   }
   // lets implement abstraction using interfaces

   /* interface is defined as blue print of class 
      it purely focuses on contract of what to do roles responsibilities 
      leaveas the entire thing to child classes and it uses implements keyword
   */
   
   // lets look at interface using human as example 

   static interface Human{
      public void look();
      public void hear();
      public void speak();
   }

   static class Boy implements Human{
      public void look(){
         System.out.println("boy is looking");
      }

      public void hear(){
         System.out.println("boy is hearing");
      }

      public void speak(){
         System.out.println("boy is speaking");
      }
   }


   static class Girl implements Human{
      public void look(){
         System.out.println("Girl is looking");
      }

      public void hear(){
         System.out.println("Girl is hearing");
      }

      public void speak(){
         System.out.println("Girl is speaking");
      }
   }
     public static void main(String args[]){
            
            Student s=new Student();    // different student have different methods
 
            Enggstud eg=new Enggstud();
            
            s.mark(); // though the implementation details are hidden what to do is tightly couped with how to do   

            eg.labs();

            // using hifgh level abstraction we can decide what to do during run time 

            Car c;

            c=new Ec(); // can decide what type of car we want to drive dynamically during run time 

            c.drive();

            c.stop();

            c=new Pc();

            c.drive();

            c.stop();

            Human h;

            h = new Boy();

            h.look();
            h.hear();
            h.speak();

            h=new Girl();

            h.look();
            h.hear();
            h.speak();
    }
}