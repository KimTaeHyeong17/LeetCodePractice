import java.util.*;
class Solution {
    List<Integer> answer = new ArrayList<Integer>();
    int[][] mat;
    int n,m;
    HashSet<Integer> set = new HashSet();
    public List<Integer> spiralOrder(int[][] matrix) {
        if(matrix.length == 0){
            return answer;
        }
        // if(matrix.length == 1){
        //     for(int i = 0 ; i < matrix[0].length ; i++){
        //         answer.add(matrix[0][i]);
        //     }
        //     return answer;
        // }
        n = matrix.length;
        m = matrix[0].length;
        mat = matrix;
      
        for(int i = 0 ; i < m/2+1 ; i++){
            if(i<m && i <n){
               System.out.println("spiral : " + i);
                spiral(i);
                System.out.println(""); 
            }
            
        }
        
        // 1st : (0,0) ~ (0,m-1) ~ (n-1,m-1) ~ (0,n-1) ~ (0,0)
        // 2nd : (1,1) ~ (0,m-2) ~ (n-2,n-2) ~ (0,n-2) ~ (1,1)
        // 1,1과 m-2,m-2 가 같으면 break?
        // m=4 n=3 일때 
        // 1,1 ~ 2,2 ~ 1,1 작아지면 break?
        return answer;
    }
    public void spiral(int start){
        for(int i = 0 ; i < m ; i++){
            System.out.print(mat[start][i] + " ");
            if(set.contains(mat[start][i]) == false){
                set.add(mat[start][i]);
                answer.add(mat[start][i]);
            }
        }
        System.out.println();
        for(int i = 0 ; i < n ; i++){
            System.out.print(mat[i][m-start-1]+ " ");
            if(set.contains(mat[i][m-start-1]) == false){
                set.add(mat[i][m-start-1]);
                answer.add(mat[i][m-start-1]);
            }
        }
        System.out.println();
        for(int i = 0 ; i < m ; i++){
            System.out.print(mat[n-start-1][m-i-1]+ " ");
            if(set.contains(mat[n-start-1][m-i-1]) == false){
                set.add(mat[n-start-1][m-i-1]);
                answer.add(mat[n-start-1][m-i-1]);
            }
        }
        System.out.println();
        for(int i = 0 ; i < n ; i++){
            System.out.print(mat[n-i-1][start]+ " ");
            if(set.contains(mat[n-i-1][start]) == false){
                set.add(mat[n-i-1][start]);
                answer.add(mat[n-i-1][start]);
            }
        }
    } 
}
  /* test case 
        [[1]]
        [[2,5],[8,4],[0,-1]]
        [[1,2,3,4],[5,6,7,8],[9,10,11,12],[13,14,15,16]]
        [[1,2,3],[4,5,6],[7,8,9]]
        [[1,2,3,4,5],[6,7,8,9,10],[11,12,13,14,15],[16,17,18,19,20],[21,22,23,24,25]]
        [[3],[2]]
        [[2,5,8],[4,0,-1]]
        [[2,3,4],[5,6,7],[8,9,10],[11,12,13],[14,15,16]]
        */
