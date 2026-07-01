import java.util.Scanner;

public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {

            for (int j = i + 1; j < nums.length; j++) {

                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }

        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        int[] ans = twoSum(nums, target);
        if (ans[0] != -1) {
            System.out.println("Indices are: " + ans[0] + " " + ans[1]);
            System.out.println("Values are: " + nums[ans[0]] + " " + nums[ans[1]]);
        } else {
            System.out.println("No pair found.");
        }
        sc.close();
    }
}