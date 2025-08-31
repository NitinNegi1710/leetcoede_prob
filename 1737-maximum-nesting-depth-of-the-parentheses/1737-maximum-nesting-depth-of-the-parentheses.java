class Solution {
    public int maxDepth(String s) {
        int count=0;
        int Max= 0;
        for( char ch:s.toCharArray()){
            if(ch=='('){
                count++;
            Max=Math.max(count,Max);
            }else if(ch==')'){
                count--;
            }
        }
        return Max;
    }
}