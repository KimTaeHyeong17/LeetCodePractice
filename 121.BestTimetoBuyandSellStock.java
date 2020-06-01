class Solution {
    public int maxProfit(int[] prices) {
        int answer = 0;
        int len = prices.length;
        for(int i = 0 ; i < len ; i++){
            for(int j = i+1 ; j < len ; j++){
                int min = prices[i];
                int max = prices[j];
                // System.out.println("max : "+ max + " min : " + min);
                if(answer < max-min){
                    answer = max-min;
                }
                
            }
        }
        return answer;
    }
}
