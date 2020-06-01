class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int len = nums.length;
        List<List<Integer>> answer = new ArrayList<>();
        Arrays.sort(nums);
        HashSet<List<Integer>> set = new HashSet<>();
        for(int i = 0 ; i < len ; i++){
            if(i==0 || (i > 0 && nums[i] != nums[i-1])){
                int low = i+1;
                int high = nums.length-1;
                int sum = 0-nums[i];
                while(low < high){
                    if(nums[low] + nums[high] == sum){
                        answer.add(Arrays.asList(nums[i],nums[low],nums[high]));
                        while(low<high && nums[low] == nums[low+1]) low++;
                        while(low<high && nums[high] == nums[high-1]) high--;
                        low++;
                        high--;

                    }else if(nums[low] + nums[high] > sum){
                        high--;
                    }else{
                        low++;
                    }
                }
            }
            
        }
        return answer;
        
    }
}
