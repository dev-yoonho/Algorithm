class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        
        for (int q = 0;q < queries.length;q++) {
            int s = queries[q][0];
            int e = queries[q][1];
            int k = queries[q][2];
            
            int minVal = Integer.MAX_VALUE;
            boolean found = false;
            
            for (int i = s;i <= e;i++) {
                if (arr[i] > k) {
                    minVal = Math.min(minVal, arr[i]);
                    found = true;
                }
            }
            answer[q] = found ? minVal:-1;
        }
        return answer;
    }
}