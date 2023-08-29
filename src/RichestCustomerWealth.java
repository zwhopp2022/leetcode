//1672. Richest Customer Wealth
// Completed by Zachary Hopp 8/29/2023
// Time Complexity: O(n x m)
// Space Complexity: O(1)
public class RichestCustomerWealth {

    public static int maxWealth(int[][] accounts) {
        int maximum = 0;
        int currentMax;


        for (int[] customer : accounts) {
            currentMax = 0;
            for (int bank : customer) {
                currentMax += bank;
            }
            if (currentMax > maximum)
                maximum = currentMax;
        }

        return maximum;
    }

}

class customerWealthMain {
    public static void main(String[] args) {
        int[][] enter = new int[][]{{7, 1, 3}, {2, 8, 7}, {1, 9, 5}};
        int expected = 17;
        int actual = RichestCustomerWealth.maxWealth(enter);

        System.out.println("Maximum Wealth in Accounts: " + actual);
    }
}


