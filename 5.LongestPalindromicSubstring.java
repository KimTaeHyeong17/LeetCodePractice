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
