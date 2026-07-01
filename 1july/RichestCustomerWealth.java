import java.util.Scanner;

public class RichestCustomerWealth {

    public static int maximumWealth(int[][] accounts) {

        int maxWealth = 0;

        for (int i = 0; i < accounts.length; i++) {

            int sum = 0;

            for (int j = 0; j < accounts[i].length; j++) {
                sum += accounts[i][j];
            }

            if (sum > maxWealth) {
                maxWealth = sum;
            }
        }

        return maxWealth;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

      
        int m = sc.nextInt();

       
        int n = sc.nextInt();

        int[][] accounts = new int[m][n];

       
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                accounts[i][j] = sc.nextInt();
            }
        }
        
        int result = maximumWealth(accounts);

        System.out.println("Maximum Wealth = " + result);

        sc.close();
    }
}