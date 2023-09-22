package Lesson6;

class Bank{

    double rateOfInterest(){
        return 5.6;
    }

}

class SBI extends Bank{

    double rateOfInterest(){
        return 10.5;
    }

}

class ICICI extends Bank{

    double rateOfInterest(){
        return 9.7;
    }

}

class AXIS extends Bank{

    double rateOfInterest(){
        return 8.5;
    }

}

public class MethodOverriding {

    public static void main(String[] args) {

        SBI sbi= new SBI();
        System.out.println("SBI interest rate: " + sbi.rateOfInterest());

        ICICI icici= new ICICI();
        System.out.println("ICICI interest rate: " + icici.rateOfInterest());

        AXIS axis= new AXIS();
        System.out.println("AXIS interest rate: " + axis.rateOfInterest());

    }

}
