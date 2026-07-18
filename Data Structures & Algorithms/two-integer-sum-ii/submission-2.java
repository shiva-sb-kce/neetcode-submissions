class Solution {
    public int[] twoSum(int[] numbers, int target) {
        Arrays.sort(numbers);
        ArrayList<Integer> res=new ArrayList<>();
        for (int i=0;i<numbers.length-1;i++){
            for (int j=i+1;j<numbers.length;j++){
                if (numbers[i]+numbers[j]==target){
                    res.add(i+1);
                    res.add(j+1);
                }
            }
        }
        int[] ans=new int[res.size()];
        int index=0;
        for (int i:res){
            ans[index++]=i;
        }
        return ans;
    }
}
