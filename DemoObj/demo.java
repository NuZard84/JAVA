class Calc {

    int a;
    static String str1;
    static String str2;

    //constructer...
    Calc() {
        System.out.println("Calculater");
    }

    
    //constructer overloading...

    Calc(String a, String b) {

        str1 = a;
        str2 = b;
        System.out.println("i am performing this operations : " + a + " " + b);
    }

    Calc(Calc x) {

        str1 = x.str1;
        str2 = x.str2;
        System.out.println("i am performing this operations (coppy from one constructer to another) : " + str1 + " " + str2);
    }

    

    public int add(int n1, int n2) {
        int r = n1 + n2;
        System.out.println("Addition");
        return r;
    }
}

public class demo {

    public static void main(String[] a) {

        int num1 = 10;
        int num2 = 20;

        Calc obj1 = new Calc();
        Calc obj0 = new Calc("+", "-");
        // this will work like this too, => obj1.str1 = obj0.str1...
        Calc obj2 = new Calc(obj0); //copping obj...
        Calc staticObj = new Calc("*", "-");
        Calc ex = new Calc(obj0); //staticly change variable ...


        int result = obj1.add(num1, num2);

        System.out.println(result);
         

    }
}
