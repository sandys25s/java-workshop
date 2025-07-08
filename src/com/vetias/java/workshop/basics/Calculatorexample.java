public class Calculatorexample {

    public int divide(int a, int b) {
        return a / b;
    }

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {
        Calculatorexample calculator = new Calculatorexample();

        System.out.println("Division: " + calculator.divide(10, 2));
        System.out.println("Addition: " + calculator.add(10, 2));
        System.out.println("Subtraction: " + calculator.subtract(10, 2));
        System.out.println("Multiplication: " + calculator.multiply(10, 2));
    }
}
