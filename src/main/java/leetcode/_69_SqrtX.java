package leetcode;

public class _69_SqrtX {

    public static void main(String[] args) {
        _69_SqrtX obj = new _69_SqrtX();

        int x = 2147483647;
        System.out.println(obj.calcSqrt(x, 0, x));
    }

    public int mySqrt(int x) {
        return calcSqrt(x, 0, x);
    }

    private int calcSqrt(int x, int start, int end) {
        int mid = (start+end)/2;

        long product = (long)mid*mid;
        if(product == x) {
            return mid;
        }

        if(product < x && (long)(mid+1)*(mid+1) > x) {
            return mid;
        }

        if(product < x) {
            return calcSqrt(x, mid+1, end);
        }

        //if(product > x) {
        return calcSqrt(x, 0, mid-1);
        // }
    }
}
