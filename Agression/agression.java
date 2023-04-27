class Operation {

    int square(int n) {
        
        return n*n;
    }
}

class Circle {
    
    Operation op; // Aggregation...
    double pi = 3.14;

    double area(int r) {
        op = new Operation();
        int rsquare = op.square(r);

        return pi*rsquare;
    }
}

class Test {

    public static void main(String a[]){+

        Circle c = new Circle();
        double area = c.area(5);
        System.out.println("area of circle is: " + area);   
    
    }
}