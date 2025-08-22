class Solution {
    public int search(int[] nums, int target) {
        int start = 0, end = nums.length - 1;
        
        while (start <= end) {
            int mid = start + (end - start) / 2;
            
            if (nums[mid] == target) 
                return mid;
            
            // Check which side is sorted
            if (nums[start] <= nums[mid]) {
                // Left side is sorted
                if (target >= nums[start] && target < nums[mid]) {
                    end = mid - 1;  // Target in left half
                } else {
                    start = mid + 1; // Target in right half
                }
            } else {
                // Right side is sorted
                if (target > nums[mid] && target <= nums[end]) {
                    start = mid + 1; // Target in right half
                } else {
                    end = mid - 1;   // Target in left half
                }
            }
        }
        
        return -1; // Target not found
    }
}
