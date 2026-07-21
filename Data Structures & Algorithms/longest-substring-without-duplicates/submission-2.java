class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max_len=0;
        for(int i=0;i<s.length();i++){
            ArrayList<Character> res=new ArrayList<>();
            for(int j=i;j<s.length();j++){
                char ch=s.charAt(j);
                if (res.contains(ch)){
                    break;
                }
                res.add(ch);
            }
            max_len=Math.max(res.size(),max_len);
        }
        return max_len;
    }
}
