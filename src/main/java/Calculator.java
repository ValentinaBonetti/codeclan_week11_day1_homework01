public class Calculator {

//    This should have functions for Add, Subtract, Multiply and Divide,
//    each taking in two integers to perform the calculations on.

    public int add(int a, int b){
        int c = a+b;
        return c;
    }

    public int subtract(int a, int b){
        return a-b;
    }

    public int multiply(int a, int b){
        return a*b;
    }

    public double divide(int a, int b){
        Double aDouble = new Double(a);
        Double bDouble = new Double(b);
        return aDouble/bDouble;
    }

}
