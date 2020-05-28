class Solution {
    public int maxSubArray(int[] nums) {
        int answer = -2147483648;
        
        if (nums.length == 1){
            return nums[0];
        }
            
        for(int i = 0 ; i < nums.length ; i++){
            int temp = 0;
            for(int j = i ; j < nums.length ; j ++){
                // System.out.print("(" + nums[i] + "," + nums[j]+")");
                temp = temp + nums[j];
                if(answer < temp){
                    answer = temp;
                }
            }
            // System.out.println("sum = " + temp);
        }
        return answer;   
    }
}
