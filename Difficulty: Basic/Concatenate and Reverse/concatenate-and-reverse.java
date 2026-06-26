class Solution {
    static String conRevstr(String s1, String s2) {
        // code here
        String s=s1+s2,newS="";
        for(int i=s.length()-1;i>=0;i--){
            newS+=s.charAt(i);
        }
        return newS;
    }
}