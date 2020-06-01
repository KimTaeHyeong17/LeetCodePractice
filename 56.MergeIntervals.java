class Solution {
    public int[][] merge(int[][] intervals) {
        
        ArrayList<String[]> arraytest = new ArrayList<>();
        String test[] = {"test1", "test2"};
        arraytest.add(test);
        for(int i = 0 ; i < arraytest.size() ; i++){
            System.out.println(arraytest.get(i)[0]);
        }
        test[0] = "testChanged";
        for(int i = 0 ; i < arraytest.size() ; i++){
            System.out.println(arraytest.get(i)[0]);
        }
        
        
        if(intervals.length <= 1){
            return intervals;
        }
        Arrays.sort(intervals,(arr1, arr2) -> Integer.compare(arr1[0],arr2[0]));
        
        ArrayList<int[]> answer = new ArrayList();
        
        int[] current_interval = intervals[0];
        
        answer.add(current_interval);
        
        for(int[] interval : intervals){
            int current_begin = current_interval[0];
            int current_end = current_interval[1];
            int next_begin = interval[0];
            int next_end = interval[1];
            
            System.out.println("["+current_begin+","+current_end+"]");
            System.out.println("["+next_begin+","+next_end+"]");

            if(current_end >= next_begin){
                current_interval[1] = Math.max(current_end, next_end);
            }else{
                current_interval = interval;
                answer.add(current_interval);
            }
            
            for(int i = 0 ; i < answer.size() ; i++){
                System.out.println(Arrays.toString(answer.get(i)));
            }
            System.out.println("");
        }
        
        
        
        return answer.toArray(new int [answer.size()][2]);
        
    
    }
}
