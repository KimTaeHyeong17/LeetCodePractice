import java.util.*;

class Solution {
    public boolean isValid(String s) {
        Stack < Character > stack = new Stack < Character > ();
    
        for (int i = 0; i < s.length(); i++) {
            if (stack.isEmpty() == true) {
                stack.push(s.charAt(i));
            } else {
                if(stack.peek() == '(' && s.charAt(i) == ')'){
                    stack.pop();
                }else if(stack.peek() == '{' && s.charAt(i) == '}'){
                    stack.pop();
                }else if(stack.peek() == '[' && s.charAt(i) == ']'){
                    stack.pop();
                }else{
                    stack.push(s.charAt(i));
                }
            }//end of else
        } //end of loop
         System.out.println("");
        System.out.println(stack);

        if (stack.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }
}

==============================================================
    
    import java.util.*;
class Solution {
    public boolean isValid(String s) {
        HashMap<Character,Character> map = new HashMap();
        map.put('(',')');
        map.put('[',']');
        map.put('{','}');
        map.put(')','@');
        map.put(']','@');
        map.put('}','@');

        Stack<Character> stack = new Stack<>();
        
        for(int  i = 0 ; i < s.length() ; i++){
            char c = s.charAt(i);
          
            if(stack.isEmpty() == true){
                stack.push(c);
            }else{
                if((map.get(stack.peek())) == c){
                    stack.pop();
                }else{
                    stack.push(c);
                }
            }
        }
        // System.out.println(stack);
        
        if(stack.isEmpty() == true){
            return true;
        }else{
            return false;
        }
        
    }
}
