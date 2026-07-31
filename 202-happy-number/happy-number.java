class Solution {

    public int squareSum(int n) {
        int sum = 0;

        while (n != 0) {
            int rem = n % 10;
            sum += rem * rem;
            n /= 10;
        }

        return sum;
    }

    public boolean isHappy(int n) {

        if (n == 1)
            return true;

        if (n == 4)
            return false;

        return isHappy(squareSum(n));
    }
}