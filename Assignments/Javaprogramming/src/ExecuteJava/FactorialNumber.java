package ExecuteJava;

public class FactorialNumber {

    public static void main(String[] args) {
        int num = 5;  // You can change this number
        long factorial = 1;

        for (int i = 1; i <= num; i++) {
            factorial *= i;  // factorial = factorial * i
        }

        System.out.println("Factorial of [" + num + "!] is: " + factorial);
    }
}
