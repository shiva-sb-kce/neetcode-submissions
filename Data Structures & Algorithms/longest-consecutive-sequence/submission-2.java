class Solution {
    public int longestConsecutive(int[] nums) {
        int max_count=1;
        int count=1;
        Set<Integer> seet=new HashSet<>();
        for (int i:nums){
            seet.add(i);
        }
        ArrayList<Integer> ans=new ArrayList<>(seet);
        Collections.sort(ans);
        if(ans.size()==0){
            return 0;
        }
        for(int i=0;i<ans.size()-1;i++){
            if (ans.get(i+1)==ans.get(i)+1){
                count++;
            }
            else{
                max_count=Math.max(count,max_count);
                count=1;
            }
        }
        max_count=Math.max(count,max_count);
        return max_count;
    }
}
