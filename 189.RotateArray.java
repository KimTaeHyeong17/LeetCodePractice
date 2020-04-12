import java.util.*;
class Solution {
    public void rotate(int[] nums, int k) {
        for(int i = 0 ; i < k ; i++){
            nums = change(nums);
        }
   
        System.out.println(Arrays.toString(nums));
    }
    public int[] change(int[] nums){
        int[] numbers = new int[nums.length];
        int endIndex = nums.length-1;
        
        for(int i = 0 ; i < numbers.length ; i++){
            if(i == endIndex){
                numbers[0] = nums[endIndex];
            }else{
                numbers[i+1] = nums[i];
            }
        }
        return numbers;
    }
}
