public class FibonacciNumbers{
    public static int Fibonacci(int n) {
        int n1 = 0;
        int n2 = 1;


        for (int i = 1; i <= n; i++) {
            System.out.print(n1 + " ");
            n1 = n1 + n2;
            n2 = n1 - n2;
        }
    return n1;
    }

    }
