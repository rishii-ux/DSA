class Solution {
    public boolean isPalindrome(int n) {
        // code here
        n=(int)Math.abs(n);
        int rev=0,k;
        k=n;
        while(k>0){
            int d=k%10;
            rev=rev*10+d;
            k=k/10;
        }
        if(rev==n){
            return true;
        }
        else return false;
    }
}