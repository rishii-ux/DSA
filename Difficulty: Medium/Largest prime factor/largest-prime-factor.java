class Solution {
    static int largestPrimeFactor(int n) {
        // code here
        int m=(int)Math.sqrt(n),ans=0;
        for(int i=2;i<=m;i++){
            if(n%i==0){
                ans=(int)Math.max(ans,i);
                while(n%i==0){
                    n/=i;
                }
            }
        }
        if(n>1){
            return n;
        }
        return ans;
    }
}