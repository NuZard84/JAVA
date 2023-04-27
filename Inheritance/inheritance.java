//Example of Inheritance...
class Employee {
    float salary = 40000;
}

class Programer extends Employee {

    int bonus = 10000;

    // public static void main(String[] argv) {
    //     Programer p = new Programer();
    //     System.out.println("Programer salary is:" + p.salary);
    //     System.out.println("Bonus of Programer is:" + p.bonus);
    // }
}

//---------------MultiLevel Inheritance-----------------

// class Devs extends Programer {

//     int completeTask = 10;
// }

// ---------------Hierarchical Inheritance-----------------

class Devs extends Employee {

    int completeTask = 10;
}

class Test {

    public static void main(String[] argv) {
        Devs d = new Devs();
        System.out.println("Programer salary is:" + d.salary);
        // System.out.println("Bonus of Programer is (Multilevel Inheritance):" + d.bonus);
        System.out.println("only programer got bonus !!(Hirechical Inheritance)");
        System.out.println("total complete task is:" + d.completeTask);
    }

}
