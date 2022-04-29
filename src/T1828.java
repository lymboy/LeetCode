public class T1828 {
    
    public int[] countPoints(int[][] points, int[][] queries) {

        int[] answer = new int[queries.length];

        for (int i=0; i<points.length; i++) {
            for (int j=0; j<queries.length; j++) {
                int x = points[i][0] - queries[j][0];
                int y = points[i][1] - queries[j][1];
                int r = queries[j][2];
                if ( ( ( (x*x) + (y*y) ) - (r*r)) <= 0 ) {
                    answer[j]++;
                }
            }
        }
        
        // return Arrays.stream(answer).filter(item -> item>0).toArray();
        return answer;
    }


}
