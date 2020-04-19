import java.util.*;
class Solution {
    HashMap<Character,Character> map = new HashMap();
    public boolean isIsomorphic(String s, String t) {
        int len = s.length(); // suppose s and t length is same
        for(int i = 0 ; i < len ; i++){
            char sc = s.charAt(i);
            char tc = t.charAt(i);
            if(i == 0){
                map.put(sc,tc);
            }else{
                if(map.containsKey(sc)){
                    //s 에서 이미 나온 글자라면 지금 t와 비교
                    if(map.get(sc) != tc){
                        return false;
                    }
                }//end of if
                //s에서 나오지 않은 글자인데 예를들어 ab aa 일때 b를 비교하는 경우
                //egg add 의 경우 e a // g d
                else if(map.containsValue(tc)){
                    //s는 새로운게 나왔는데 t에 기존에 있던게 있으면 안되지 
                    return false;
                }
            }//end of else
            map.put(sc,tc);
        }//end of loop
        return true;
    }
}

/* ============================================================= */
public class Solution {
    
    public boolean isIsomorphic(String sString, String tString) {

        char[] s = sString.toCharArray();
        char[] t = tString.toCharArray();

        int length = s.length;
        if(length != t.length) return false;
		//ASCII 문자 256을 담을 수 있는 char array
        char[] sm = new char[256];
        char[] tm = new char[256];
		
        for(int i=0; i<length; i++){
            char sc = s[i];
            char tc = t[i];
            if(sm[sc] == 0 && tm[tc] == 0){
            	//없는 문자라면 문자 ASCII 번호를 index 로 하는 배열에 char 을 저장
                sm[sc] = tc;
                tm[tc] = sc;
            }else{
            	//있는 문자라면
                if(sm[sc] != tc || tm[tc] != sc){
                	//s와 t 서로 다른 대응되는 문자가 있을 경우
                    return false;
                }
            }
        }
        return true;
    }
}
