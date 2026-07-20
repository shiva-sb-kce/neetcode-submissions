class Solution { 
    public List<List<Integer>> threeSum(int[] nums) { 
        List<List<Integer>> res = new ArrayList<>(); 
        Arrays.sort(nums); // Sort to use two-pointer technique
        
        for (int i = 0; i < nums.length - 2; i++) { 
            // Skip duplicate values for the first element
            if (i > 0 && nums[i] == nums[i - 1]) { 
                continue; 
            } 
            
            int j = i + 1; 
            int k = nums.length - 1; 
            
            while (j < k) { 
                int tot = nums[i] + nums[j] + nums[k]; 
                
                if (tot == 0) { 
                    res.add(Arrays.asList(nums[i], nums[j], nums[k])); 
                    j++; 
                    k--; 
                    
                    // CORRECTED: Compare with previous elements to skip duplicates safely
                    while (j < k && nums[j] == nums[j - 1]) { 
                        j++; 
                    } 
                    while (j < k && nums[k] == nums[k + 1]) { 
                        k--; 
                    } 
                } else if (tot < 0) { 
                    j++; // Sum is too small, move right to increase value
                } else { 
                    k--; // Sum is too large, move left to decrease value
                } 
            } 
        } 
        return res; 
    } 
}
