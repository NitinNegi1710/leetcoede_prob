class Solution {
    public boolean rotateString(String s, String goal) {
        // char c =s.charAt(0);
        int m = s.length();
        if(s.length()!=goal.length())return false;
        char[] chars = goal.toCharArray();
        // int mod;
        for(int mod =0;mod<m;mod++){
            if(s.charAt(0)==chars[mod]){
                boolean match = true;
                for(int i =0;i<m;i++){
                    if(s.charAt(i)!=goal.charAt((i+mod)%m)){
                        match=false;
                        break;
                    }
                }
                if(match)return true;
            }
        }
        // int mod = goal.indexOf(c);
        
        // if(s.length()!=goal.length())return false;
        // for(int i =0;i<s.length();i++){
            
        return false;
                                                                            
    }
}