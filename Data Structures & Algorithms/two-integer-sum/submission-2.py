class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        freq={}
        for i,num in enumerate(nums):
            rem=target-num

            if rem in freq:
                return [freq[rem],i] 

            freq[num]=i
        