public class OddNumbers {
    public static void OddNumbers(int n) {
        int[] odds = new int[n];
        for( int i = 0; i<n; i++) {

             odds[i]=2*i-1;
            if( i % 2 != 0){
                System.out.print(i + " ");
            }


        }

    }
}