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

import java.util.*;
class Solution {
    
    ArrayList<Integer> arrayList = new ArrayList();
    public int countPrimes(int n) {
        int answer = 0;
        
        if(n==2){
            return 0;
        }
        // 1 - 일단 전체 arrayList 를 만든다.
        for(int i = 2 ; i < n ; i++){
            arrayList.add(i);
        }
        
        //문제점 : 2의 배수만 없어지고 있다.
        //2의 배수를 없애고 나선 다음걸 없애야 되는데 break 때문인건가
        for(int i = 0 ; i < arrayList.size() ; i++){
            // 2 - arrayList의 i 번째 항목이 소수라면 
            // 2 가 제일 먼저 선택된다. 그럼 2의 배수를 없앤다.
            if(isPrime(arrayList.get(i)) == true){
                // 2 - arrayList의 i번째 항목이 소수라면
                removeAllMultipleNumber(arrayList.get(i));
                // break;
            }
        }
  
        //debug
        // for(int primeNumber : arrayList){
        //     System.out.println(primeNumber);
        // }
        answer = arrayList.size();
    
        
        return answer;  
    }
    public void removeAllMultipleNumber(int n){
        // 3 - arrayList 중 n 의 배수들은 다 없앤다.
        //먼저 자기자신 빼고 2의 배수들이 다 제외된다.
        for(int i = 0 ; i < arrayList.size() ;i++){
            // 4 - arrayList.get(i)가 n 의 배수이면 없앤다.
            if(isAMultipleOfB(arrayList.get(i) , n)){
                // 2 자기자신 빼고 2의 배수들을 다 없앤다.
                // System.out.println("removed item : " + arrayList.get(i));
                arrayList.remove(i);
            }
        }
    }
    public boolean isAMultipleOfB(int a, int b){
        if(a==b){
            //자기 자신일때는 빼지 않는다.
            return false;
        }
        if(a%b==0){
            return true;
        }else{
            return false;
        }
    }
    
    public boolean isPrime(int n){
        if(n==1){
            return false;
        }
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
