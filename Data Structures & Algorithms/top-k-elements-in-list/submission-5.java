class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> freq=new HashMap<>();
        if(nums.length==1){
            return nums;
        }
        for(int i:nums){
            freq.put(i,freq.getOrDefault(i,0)+1);
        }
        List<Integer> res=new ArrayList<>(freq.keySet());
        res.sort((a,b) -> freq.get(b)-freq.get(a));
        int[] ans=new int[k];
        for(int i=0;i<k;i++){
            ans[i]=res.get(i);
        }
        return ans;     
    }
}
