import java.util.*;
class Solution {
    ArrayList<String> answer = new ArrayList();

    public List<String> generateParenthesis(int n) {
      //조합 (순서관심없고 뽑은 유무만 생각)
        int[] comArr = new int[n];
        combination(comArr, n*2, n, 0, 0);
        
        return answer;
    }
    public boolean isValid(char[] str){
        char[] array = str;
        Stack<Character> stack = new Stack();
        for(int i = 0 ; i < array.length ; i++){
            if(array[i]=='('){
                stack.push(array[i]);
            }else if(stack.isEmpty() == false){
                //) 일때
                if(stack.peek()=='('){
                    stack.pop();
                }
            }else{
                return false;
            }
        }
        if(stack.isEmpty() == true){
            return true;
        }else{
            return false;
        }
    }
    private  void combination(int[] comArr, int n, int r, int index, int target) {
        if(r==0){
            char[] array = new char[n];
            Arrays.fill(array,'0');
            for(int i : comArr){
                // System.out.print(i+" ");
                array[i] = '(';
                
            }
            for(int i = 0 ; i < array.length ; i++){
                if(array[i] == '0'){
                    array[i] = ')';
                }
            }
            
            if(isValid(array) == true){
                String str = "";
                for(int i = 0 ; i < array.length ; i++){
                    str = str+array[i];
                }
                answer.add(str);
            }
            // System.out.println();
            return;
        }
        if(target == n)return;
         
        comArr[index] = target;
        combination(comArr, n, r-1, index+1, target+1);//뽑는경우
        combination(comArr, n, r, index, target+1);//안뽑는경우
         
    }
}
