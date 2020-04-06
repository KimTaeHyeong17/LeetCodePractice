class Solution {
    public int countPrimes(int n) {
        int answer = 0;
        if(n==2){
            return 0;
        }
        for(int i = 2 ; i < n ; i++){
            if(isPrime(i) == true){
                answer++;
            }
        }
        return answer;  
    }
    public boolean isPrime(int n){
        if(n==2){
            return true;
        }
        for(int i = 2 ; i < n ; i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}
