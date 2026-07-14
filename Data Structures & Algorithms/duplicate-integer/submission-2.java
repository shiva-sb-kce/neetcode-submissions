class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> seen=new HashSet<>();
        int count=1;
        for(int i:nums){
            if (seen.contains(i)){
                count++;
            }
            else{
                seen.add(i);
            }
        }
        if(count>1){
            return true;
        }
        else{
            return false;
        }
        
    }
}