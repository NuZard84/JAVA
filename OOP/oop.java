class Test {

    int t1;
    String t2;
    int t3;
    Oop obj0;

    Test getTest() {
        return this;
    }

    void msg() {
        System.out.println("this will return this(what is function )");
    }

    //----------------------------------------------------------------

    Test() {
        this("this will test !");
    }

    Test(Oop obj0) {
        this.obj0 = obj0;
    }

    void display1() {
        System.out.println(obj0.data);  //assign data of Oop object -> data...
    }

//--------------------------------------------------------------
    Test(String print) {
        System.out.println("print by using this : " + print);
    }

    void method(Test o) {
        System.out.println("this is method by passsing object of Test !");
    }

    void invoke() {
        method(this);
    }

//--------------------------------------------------------------
    void hello() {
        System.out.println("Hello");    
    }

    void greet() {
        this.hello();
    }

//---------------------------------------------------------------
    Test(int t1, String t2, int diff) {
        this.t1 = t1;
        this.t2 = t2;
        this.t3 = diff;
    }
    
    void display0() {
        System.out.println("t1 = " + t1 + " t2 = " + t2 + " t3 = " + t3);
    }
}

class Oop {

    String data = "this is data of Oop class !"; 

    Oop() {  //this is constructor of Oop class..
        Test t0 = new Test(this); //here this = Oop <obj>...
        t0.display1();  
    }

    public static void main(String[] args) {

        Oop a = new Oop();
        Test obj = new Test(10, "Hello", 20);
        obj.display0();
        obj.greet();
        obj.invoke(); //invoking method by passing param as object of clas Test..
        new Test().getTest().msg(); //print what return fucntion msg return...
        
    }
}
