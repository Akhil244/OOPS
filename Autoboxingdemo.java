class Autoboxingdemo{
     
     /* 
    we have 2 things in java 

    Autoboxing and unboxing 

    in Auto boxing we convert the primitive datatype to relevant wrapper class automatically

    java compiler internally uses the method Wrapper_class_name.valueOf() to convert it to wrapper

    in unboxing its inverse of autoboxing (we convert wrapper class into primitive datatype)
    
    java compiler internally uses the method <wrapperclasstype>Value() gettter method to fetch the relevant 

    primitive datatype value 

    both autoboxing and unboxing can be applied for:

    1) methods
    2) operators 
    3) primitive datatypes

     */

     public static void Wrapperclassdemo(){
        
        // Autoboxing
        // internally does Integer.valueOf() instead of manually writting it ourselves
        int x=10;
        Integer val=x; // declaration of integer wrapper class which is derived from primitive datatype int 
        System.out.println(val);

        //unboxing 

        Integer i=10;
        int v=i;
        System.out.println(v); // it internally does intvalue() method 

        // we can implement the same code inside seperate methods perform arithematic ops too

     }
     public static void main(String args[]){
        
        Wrapperclassdemo();

     }
}