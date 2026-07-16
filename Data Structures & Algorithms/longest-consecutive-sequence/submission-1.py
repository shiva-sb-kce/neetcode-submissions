class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        max_count=1
        count=1
        num_set=set(nums)
        ans=list(num_set)
        ans.sort()
        if not nums:
            return 0
        for i in range(len(ans)-1):
            if ans[i+1]==ans[i]+1:
                count+=1
            else:
                max_count=max(max_count,count)
                count=1
        max_count=max(max_count,count)
        return max_count