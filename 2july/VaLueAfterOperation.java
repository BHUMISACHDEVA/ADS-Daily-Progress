import java.util.Scanner;

public class VaLueAfterOperation {

    public static int finalValueAfterOperations(String[] operations) {
        int x = 0;

        for (int i = 0; i < operations.length; i++) {
            if (operations[i].equals("X++") || operations[i].equals("++X")) {
                x++;
            } else {
                x--;
            }
        }

        return x;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        int n = sc.nextInt();

        String[] operations = new String[n];

        

        for (int i = 0; i < n; i++) {
            operations[i] = sc.next();
        }

        int result = finalValueAfterOperations(operations);

        System.out.println("Final Value of x = " + result);

        sc.close();
    }
}