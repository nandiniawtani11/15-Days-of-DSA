class Solution{
    

public int[][] merge(int[][] intervals) {
        if(intervals == null || intervals.length == 0){
            return new int[0][];
        }
        int[] start = new int[intervals.length];
        int[] end = new int[intervals.length];
        List<int[]> res = new LinkedList<>();
        for(int i = 0; i < intervals.length; i++){
            start[i] = intervals[i][0];
            end[i] = intervals[i][1];
        }
        Arrays.sort(start);
        Arrays.sort(end);
		
        int j = 0;
        for(int i = 0; i < intervals.length - 1; i++) { 
            if(start[i + 1] > end[i]) { 
                res.add(new int[] {start[j], end[i]}); 
                j = i + 1;  
            }    
        }
        res.add(new int[] {start[j], end[intervals.length - 1]}); 
        return res.toArray(new int[res.size()][]);
    }
}
