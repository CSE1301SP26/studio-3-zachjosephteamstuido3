import java.util.Scanner;

public class SieveOfEratosthenes {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("How many numbers do you want to look at");
        int n = in.nextInt();

        boolean[] numbersArray = new boolean[n + 1];
        for (int i = 0; i < numbersArray.length; i++) {
            numbersArray[i] = true;
        }
        for (int multiple = 2; multiple <= Math.sqrt(n); multiple++) {
            if (numbersArray[multiple] == true)
            {
             for (int multiple2 = multiple * multiple; multiple2 <= n; multiple2 += multiple) {
                    numbersArray[multiple2] = false;
             }
            }

        }
        for (int ont = 0; ont < numbersArray.length; ont++) {
            System.out.println("the number " + ont + " is " + numbersArray[ont]);
        }

    }
}
