class Animal {

    void eat() { //this method must be available ... 
        System.out.println("Animal Food !");
    }
    String animal = "Animal"; //this will only data-member can be accessed directly...

}

class Lion extends Animal {

    void eat() {
        System.out.println("Lion: Meat");
    }
    String animal = "Lion";
}

class Cow extends Animal {

    void eat() {
        System.out.println("Cow: Grass");
    }

    String animal = "Cow";
}
class Dog extends Animal {

    void eat() {
        System.out.println("Dog: Bread");
    }
    String animal = "Dog";
}

class Test {
    public static void main(String[] arg) {
        
        Animal an = new Animal();
        an.eat();

        an = new Lion();
        an.eat();

        an = new Dog();
        an.eat();

        an = new Cow();
        an.eat();

        System.out.println("data-member: " + an.animal);
    }

}