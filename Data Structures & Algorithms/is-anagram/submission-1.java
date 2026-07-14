class Solution {
    public boolean isAnagram(String s, String t) {
        List<Character> chars1=new ArrayList<>();
        List<Character> chars2=new ArrayList<>();

        for(char c:s.toCharArray()){
            chars1.add(c);
        }
        for(char c:t.toCharArray()){
            chars2.add(c);
        }
        Collections.sort(chars1);
        Collections.sort(chars2);
        if(chars1.equals(chars2)){
            return true;
        }
        else{
            return false;
        }
    }
}
