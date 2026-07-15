class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> res=new HashMap<>();
        for(String i:strs){
            char[] chars=i.toCharArray();
            Arrays.sort(chars);
            String key=new String(chars);
            if(!res.containsKey(key)){
                res.put(key,new ArrayList<>());
            }
            res.get(key).add(i);
        }
        return new ArrayList<>(res.values());
    }
}
