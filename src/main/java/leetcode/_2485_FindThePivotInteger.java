package leetcode;

public class _2485_FindThePivotInteger {

    public static void main(String[] args) {
        _2485_FindThePivotInteger obj = new _2485_FindThePivotInteger();

        int n = 1;
        System.out.println(obj.pivotInteger(n));
    }

    public int pivotInteger(int n) {
        int leftValue = 1;
        int rightValue = n;
        int sumLeft = leftValue;
        int sumRight = rightValue;

        if (n == 1) return n;

        // Iterate until the pointers meet
        while (leftValue < rightValue) {
            // Adjust sums and pointers based on comparison
            if (sumLeft < sumRight) {
                sumLeft += ++leftValue;
            } else {
                sumRight += --rightValue;
            }

            // Check for pivot condition
            if (sumLeft == sumRight && leftValue + 1 == rightValue - 1) {
                return leftValue + 1;
            }
        }
        return -1; // Return -1 if no pivot is found
    }
}
