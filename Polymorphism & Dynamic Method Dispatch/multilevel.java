class Animal {

    void eat() {
        System.out.println("Animal Food !");
    }

}

class Dog extends Animal {

    void eat() {
        System.out.println("Dog Food");
    }
}

class AdultDog extends Dog {

    void eat() {
        System.out.println("Adult Dog Food");
    }
}

class Babydog extends AdultDog {

    public static void main(String[] arg) {
        Animal an = new Animal();
        an.eat();

        an = new Dog();
        an.eat();

        an = new AdultDog();
        an.eat();

        an = new Babydog();
        an.eat();  // this will excute method of adultDog food ... it has not own method

    }
}
