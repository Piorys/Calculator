package App;
public class Calculator {
    double add( double a, double b){
        return a + b;
    }

    double sub(double a, double b){
        return a - b;
    }

    double mult(double a, double b){
        return a * b;
    }

    double div(double a, double b){
        return a / b;
    }
    
    public void addAndPrint (double a, double b) {
    double result = a + b;
    System.out.println("Result: " + result);
}

    public void subAndPrint (double a, double b) {
    double result = a - b;
    System.out.println("Result: " + result);
}
    public void multAndPrint (double a, double b) {
    double result = a * b;
    System.out.println("Result: " + result);
}
    public void divAndPrint (double a, double b) {
    double result = a / b;
    System.out.println("Result: " + result);
}

}