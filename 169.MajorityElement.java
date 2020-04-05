import java.util.*;
class Solution {
    public int majorityElement(int[] nums) {
        int maxCount = 0;
        int count = 0;
        int element = 0;
        
        Arrays.sort(nums);
        
        if(nums.length == 1){
            return nums[0];
        }
        
        for(int i = 0 ; i < nums.length-1 ; i++){
            if (nums[i] == nums[i+1]){
                count++;
                if(count >= nums.length/2){
                    return nums[i];
                }
            }else{
                if (maxCount < count){
                    maxCount = count;
                    count = 1;
                    element = nums[i];
                }
            }
        }
        
        return element;
    }

}
