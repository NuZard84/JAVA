//super keyword is used to use property of super-class...
class Animal {

    Animal() {
        System.out.println("we have to be kind with animals...");
    }
    void eat() {
        System.out.println("eating...");
    }
}

class Dog extends Animal {
    
    Dog() {
        super(); //call super-class constructor
    }
    
    void eat() {
        System.out.println("eating bread...");
    }
    
    void bark() {
        
        System.out.println("barking...");
    }

    void superDog() {
        
        super.eat(); //use super-class property
        eat();
        bark();
    }
    
}

class Test {

    public static void main(String args[]) {

        Dog d = new Dog();
        d.superDog(); 

    }
}