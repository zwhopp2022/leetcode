// 1480. Running Sum of 1D Array
// Completed by Zachary Hopp 8/29/2023
public class runningSum {
    public static int[] calcRunningSum(int[] nums) {
        int[] results = new int[nums.length];

        results[0] = nums[0];

        for (int index = 1; index < nums.length; index++) {
            results[index] = nums[index] + results[index - 1];
        }

        return results;
    }

    // time complexity = O(n)
    // space complexity = O(1)
}

class runningSumMain {
    public static void main(String[] args) {
        int[] enter = new int[]{3, 0, 1, 2};

        int[] results = runningSum.calcRunningSum(enter);

        for (int num : results) {
            System.out.println("Running Sum: " + num);
        }
    }
}