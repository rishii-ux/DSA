class Solution {
    public static boolean isPowerofTwo(int n) {
        // code here
        for(int i=0;i<=(int)Math.sqrt(n)+1;i++){
            if((int)Math.pow(2,i)==n){
                return true;
            }
        }
        return false;
    }
}