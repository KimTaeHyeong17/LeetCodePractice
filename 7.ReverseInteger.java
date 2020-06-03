class Solution {
    public int reverse(int x) {
        String s = String.valueOf(x);
        String answer = "";
        if(x>0){
            for(int i = s.length()-1 ; i > -1 ; i--){
            answer = answer + s.charAt(i);
            }
        }
        
        if(x<0){
            for(int i = s.length()-1 ; i > 0 ; i--){
            answer = answer + s.charAt(i);
            }
            answer = "-" + answer;
        }
        
        if(x==0){
            return 0;
        }
        try{
            return Integer.parseInt(answer);
        }catch(Exception e){
            return 0;
        }   
    }
}
