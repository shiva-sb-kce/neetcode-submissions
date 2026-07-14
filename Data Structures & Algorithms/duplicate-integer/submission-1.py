class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        seen=set()
        count=1
        for i in nums:
            if i in seen:
                count+=1
            else:
                seen.add(i)
        if count>1:
            return True
        else:
            return False
        