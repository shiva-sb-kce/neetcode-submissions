class Solution:
    def threeSum(self, nums: list[int]) -> list[list[int]]:
        res = []
        nums.sort()  # Crucial first step

        for i in range(len(nums) - 2):
            # Skip duplicates for the first element
            if i > 0 and nums[i] == nums[i - 1]:
                continue
                
            j = i + 1
            k = len(nums) - 1
            
            while j < k:
                tot = nums[i] + nums[j] + nums[k]
                
                if tot == 0:
                    res.append([nums[i], nums[j], nums[k]])
                    j += 1
                    k -= 1
                    # Skip duplicates for the second element
                    while j < k and nums[j] == nums[j - 1]:
                        j += 1
                    # Skip duplicates for the third element
                    while j < k and nums[k] == nums[k + 1]:
                        k -= 1
                elif tot < 0:
                    j += 1
                else:
                    k -= 1
                    
        return res
