class Person {
    int id;
    String name;

    Person(){

    }

    Person(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
    
class Emp extends Person {
    
    float salary;

    Emp(int id, String name, float salary) {
        super(id, name); //reusing parent constructor
        this.salary = salary;
    }

}

class Test {
    
    public static void main(String[] arg) {
        
        Emp e = new Emp(1, "het", 450000);
        
        System.out.println(e.id + " " + e.name + " " + e.salary);
    }

}