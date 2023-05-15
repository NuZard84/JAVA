//final variable ...
// It can't be changed because final variable once assigned a value can never be changed. 
class Bike9 {

    final int speedlimit = 90;//final variable  

    void run() {

        speedlimit = 400;//type error...

    }

    public static void main(String args[]) {

        Bike9 obj = new Bike9();

        obj.run();

    }
}

//blank-final variable...
//If you want to create a variable that is initialized at the time of creating object and once initialized may not be changed.
//It can be initialized only in constructor.

class Bike10 {
    
  final int speedlimit;//blank final variable  
    
  Bike10(){  
  speedlimit=70;  
  System.out.println(speedlimit);
  
  }  
  
  public static void main(String args[]) {

      new Bike10();

  }
   
}

//staic-blank-final variable...
//It can be initialized only in static block.

class Bike11 {
    
  static final int speedlimit;//static blank final variable  
    
  static{  
  speedlimit=70;  
  System.out.println(speedlimit);
  
  }  
  
  public static void main(String args[]) {

      new Bike11();

  }
   
}

//final class method....
//If you make any method as final, you cannot override it.

class Bike {
        
    final void run(final int n) { //it cannot be changed...
        System.out.println("running");
    }
      
    }  
         
    class Honda extends Bike {
        
        void run() { // can not override final method

            System.out.println("running safely with 100kmph");
    }  
         
    public static void main(String args[]) {
        
       Honda honda= new Honda();  
       honda.run();
       
       }  
    }  

    //java class final....
    //cannot be extended...

    final class Bike {
            
        }  
      
        class Honda1 extends Bike {  //cannot be extended...
            void run() {
                System.out.println("running safely with 100kmph");
    }  
        
    public static void main(String args[]) {
        
      Honda1 honda= new Honda1();  
      honda.run();
      
      }  
    }  