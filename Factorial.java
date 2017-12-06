public class Factorial {
    public static void  factoria(int n) {
        int factorial =1;
        int i=n;
        while(i>1) {
            factorial =i*factorial;
            i--;
            System.out.println("Factorial of "+ n +" is: " + factorial);
        }

    }

}
