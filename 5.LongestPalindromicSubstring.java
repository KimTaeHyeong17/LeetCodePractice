import java.util.*;
class Solution {
    public String longestPalindrome(String s) {
        String answer = "";
        int len = s.length();
        for(int i = len ; i > 0 ; i--){
            int comparesize = i;
            // System.out.println(i);
            
            for(int j = 0 ; j < len ; j++){
                int head = j;
                int tail = j+i;
                 if(tail > len){
                    break;
                }
                
                String temp = s.substring(head,tail);
                // System.out.println(head + " : " + tail);
                // System.out.println(temp);
                if( isPalindrom(temp)){
                    if(answer.length() < temp.length()){
                        answer = temp;
                    }
                }
               
            }
        }
        
        return answer;   
    }
    
    public boolean isPalindrom(String str){
        for(int i = 0; i<str.length()/2; i++){
            int compIdx = str.length()-i-1;
            if(str.charAt(i) == (str.charAt(compIdx)) == false){                                                            
                return false;
            }
        }
        return true;
    }
}
================================================
    class Solution {
    
    int index, maxLen;
    
    public String longestPalindrome(String s) {
        int len = s.length();
        if(len<2){
            return s;
        }
        
        for(int i = 0 ; i  < len - 1 ; i++){
            find(s,i,i);
            find(s,i,i+1);
        }
        return s.substring(index,index+maxLen);
        
    }
    
    public void find(String s, int i, int j){
        while(i >= 0 && j < s.length() && s.charAt(i) == s.charAt(j)){
            i--;
            j++;
        }
        if(maxLen < j-i-1){
            index = i+1;
            maxLen = j - i -1;
        }
    }
}

