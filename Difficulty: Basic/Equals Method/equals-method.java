class Solution {
    public static boolean areEqual(int a[], int b[]) {
        // code here
        if(a.length!=b.length){
            return false;
        }
        else{
            for(int i=0;i<a.length;i++){
                if(a[i]!=b[i]){
                    return false;
                }
            }
        }
        return true;
    }
}