class Bank {

    int  gerRateOfIntrest() {
        return 0;
    }

}

class Sbi extends Bank {

    int getRateOfIntrest(int r) {
        return r;
    }

}

class Hdfc extends Bank {
    int getRateOfIntrest(int r) {
        return r;
    }
}

class Sgb extends Bank {

    int getRateOfIntrest(int r) {
        return r;
    }
}

class Test {

    public static void main(String[] agv) {
        
        
        Sbi sbi = new Sbi();
        Hdfc hdfc = new Hdfc();
        Sgb sgb = new Sgb();
        System.out.println("Rate of intrest is of sbi: " + sbi.getRateOfIntrest(7) + "%");
        System.out.println("Rate of intrest is of hdfc: " + hdfc.getRateOfIntrest(8) + "%");
        System.out.println("Rate of intrest is of sgb: " + sgb.getRateOfIntrest(9) + "%");

        //another way to execute....
        // Bank b = new Bank();
        // System.out.println("Rate of intrest is: " + b.gerRateOfIntrest() + "%");
        // b = new Sbi();
        // System.out.println("Rate of intrest is: " + b.gerRateOfIntrest() + "%");
        // b = new Hdfc();
        // System.out.println("Rate of intrest is: " + b.gerRateOfIntrest() + "%");
        // b = new Sgb();
        // System.out.println("Rate of intrest is: " + b.gerRateOfIntrest() + "%");
    }

    

}