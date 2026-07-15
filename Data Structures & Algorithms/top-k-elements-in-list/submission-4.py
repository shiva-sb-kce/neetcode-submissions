class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        freq={}
        if len(nums)==k:
            return nums
        for i in nums:
            if i in freq:
                freq[i]+=1
            else:
                freq[i]=1
        max_key=sorted(freq,key=freq.get,reverse=True)[:k]
        return max_key