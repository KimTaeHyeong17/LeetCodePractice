import java.util.*;
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        HashMap <Integer,Integer> map = new HashMap<>();
        List<Integer> answer = new ArrayList();
     
        for(int i = 0 ; i < nums.length ; i++){
            map.put(nums[i],nums[i]);
        }
        for(int i = 1; i < nums.length+1 ; i++){
            if(map.containsKey(i) == false){
                answer.add(i);
            }
        }
        
        return answer;
    }
}


