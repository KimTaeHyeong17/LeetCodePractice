class Solution {
    public int mctFromLeafValues(int[] arr) {
        int len = arr.length;
        int dp[][] = new int[len][len];
        for (int i = 0; i < len; i++) {
            int right = i+1;
            for (int left = 0; left<len && right <len; left++) {
                if(right - left == 1){
                    // System.out.println(left + " , " + right);
                    dp[left][right] = arr[left]*arr[right];
                }else {
                    for(int index = left; index < right; index++) {
                        // System.out.println(left + " , " + right);

                        if(dp[left][right] == 0) {
                            dp[left][right] = dp[left][index] + dp[index + 1][right] + maxValue(arr, left, index) * maxValue(arr, index + 1, right);
                        } else {
                            dp[left][right] = Math.min(dp[left][right], dp[left][index] + dp[index + 1][right] + maxValue(arr, left, index) * maxValue(arr, index + 1, right));
                        }
                    }
                }
                right++;
            }
        }
        return dp[0][len-1];
    }
    public int maxValue(int[] arr, int start, int end){
        int max = Integer.MIN_VALUE;
        for (int i = start; i <= end; i++) {
            if(arr[i] > max) max = arr[i];
        }

        return max;
    }

}
