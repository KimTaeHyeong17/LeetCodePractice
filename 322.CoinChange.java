class Solution {
    public int coinChange(int[] coins, int amount) {
        if (amount <= 0) {
            return 0;
        }

        // create dp array with all elements initilase to max value (say amt+1)
        int[] dp = new int[amount+ 1];
        Arrays.fill(dp, amount + 1);

        // initialise dp[0] to 0 and if coin corresponding to amount exist then 1
        dp[0] = 0;
        int count = 0;
        for (int coin : coins) {
            if(coin <= amount){
                dp[coin] = 1;
                count++;
            }
        }

        // dp[i] = min(dp[i], 1 + dp[i-coins[0...n]])
        for (int i = count; i <= amount; i++) {
            // to ignore those amt whose coin exists
            for (int coin : coins) {
                // if coin too large then skip
                if (coin > i) {
                    continue;
                }
                dp[i] = Math.min(dp[i], 1 + dp[i - coin]);
            }
        }
        if(dp[amount] < amount + 1){
            return dp[amount];
        }else{
            return -1;
        }
    }
}
