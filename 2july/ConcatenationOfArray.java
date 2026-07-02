import java.util.Scanner;


public class ConcatenationOfArray {

    public static int[] getConcatenation(int[] nums) {
        int ans[] = new int[2 * nums.length];
        int j = 0;

       
        for (int i = 0; i < nums.length; i++) {
            ans[j] = nums[i];
            j++;
        }

        for (int i = 0; i < nums.length; i++) {
            ans[j] = nums[i];
            j++;
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        int n = sc.nextInt();

        int nums[] = new int[n];

        
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        
        int ans[] = getConcatenation(nums);

       
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }

        sc.close();
    }
}
    

