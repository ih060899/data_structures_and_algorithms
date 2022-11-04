package tree;

public class Factorial {
    public static void main(String[] args) {
//        System.out.println(factorialIteration(4));
        System.out.println(factorial(10));
    }

    private static int factorial(int n) {
        if (n == 0){
            return 1;
        }
        return n * factorial(n - 1);
    }

    private static int factorialIteration(int n) {
        int factorial = 1;
        for (int i = n; i > 1 ; i--) {
            factorial *= i;
        }
        return factorial;
    }
}
