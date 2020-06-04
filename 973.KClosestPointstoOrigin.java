import java.util.*;
class Solution {
    ArrayList<Node> array = new ArrayList();
    ArrayList<int[]> answer = new ArrayList();
    
    public int[][] kClosest(int[][] points, int K) {
        for(int i = 0 ; i < points.length ; i++){
            Node node = new Node();
            node.x = points[i][0];
            node.y = points[i][1];
            node.d =  (Math.pow(points[i][0], 2) + Math.pow(points[i][1],2));
            array.add(node);
        }
        Collections.sort(array, new Comparator<Node>() {
            @Override
            public int compare(Node o1, Node o2) {
                if(o1.d-o2.d>0){
                    return 1;
                }else{
                    return -1;
                }
             }
        });
        int count = 1;
        for(int i = 0 ; i < array.size() ; i++){
        
            Node item1 = array.get(i);
            int[] temp = new int[2];
            temp[0] = item1.x;
            temp[1] = item1.y;
            answer.add(temp);
            // System.out.println(item1.x + " " + item1.y + " " + item1.d + " " + count);
            if(count == K){
                break;
            }
            count++;

        }
        int[][] temp = new int[answer.size()][2];
        for(int i = 0 ; i < answer.size() ; i++){
            temp[i] = answer.get(i);
        }
        
        return  temp;

    }
    public void print(){      
        for(int i = 0  ; i < array.size() ; i++){
            Node item = array.get(i);
            System.out.println(item.x + " " + item.y + " " + item.d);
        }
    }
}
class Node {
    int x;
    int y;
    double d;
}
