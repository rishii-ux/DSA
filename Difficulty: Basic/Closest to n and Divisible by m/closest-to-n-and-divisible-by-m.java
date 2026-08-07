class Solution {
    static int closestNumber(int n, int m) {
        int q = n / m;

        int a = q * m;
        int b;

        if (n * m > 0) {
            b = (q + 1) * m;
        } else {
            b = (q - 1) * m;
        }

        if (Math.abs(n - a) < Math.abs(n - b)) {
            return a;
        } else {
            return b;
        }
    }
}