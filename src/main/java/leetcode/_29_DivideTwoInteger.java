package leetcode;

public class _29_DivideTwoInteger {

    public static void main(String[] args) {
        _29_DivideTwoInteger obj = new _29_DivideTwoInteger();
        int dividend = 10, divisor = 3;

        System.out.println(obj.divide_v2(dividend, divisor));
    }

    public int divide_v2(int dividend, int divisor) {

        int result = 0;

        if (dividend == 0) {
            return result;
        }
        boolean isPositive = (dividend > 0 && divisor > 0) || (dividend < 0 && divisor < 0);
        dividend = Math.abs(dividend);
        divisor = Math.abs(divisor);

        while (dividend > divisor) {
            dividend -= divisor;
            result++;
        }

        return  isPositive ? result : -result;
    }

    public int divide(int dividend, int divisor) {

        if (dividend == 0) {
            return 0;
        }

        int result = 0;

        boolean isPositive = (dividend > 0 && divisor > 0) || (dividend < 0 && divisor < 0);

        dividend = Math.abs(dividend);
        divisor = Math.abs(divisor);

        if (dividend < divisor) {
            return 0;
        }

        if (divisor == 1) {
            result = isPositive ? dividend : -dividend;

            if (result >= Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }

            if (result <= Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }
        }

        int val = divisor;
        /*
            Explanation:

            https://leetcode.com/problems/divide-two-integers/discuss/1516367/Complete-Thinking-Process-or-Intuitive-Explanation-or-All-rules-followed-or-C%2B%2B-code
         */
        for (int i =0; ; ) {
            val = val << 1;

            if (val > dividend ) {
                result = result + (1 << i);

                dividend = dividend - (val >> 1);

                if (dividend < divisor) {
                    break;
                }
                i = 0;
                val = divisor;
            } else {
                i++;
            }

        }

        return  isPositive ? result : -result;
    }
}
