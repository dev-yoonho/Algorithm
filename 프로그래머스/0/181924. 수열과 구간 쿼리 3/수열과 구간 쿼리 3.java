class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        for (int i = 0;i < queries.length;i++) {
            int temp1 = arr[queries[i][0]];
            int temp2 = arr[queries[i][1]];
            
            arr[queries[i][0]] = temp2;
            arr[queries[i][1]] = temp1;
        }
        return arr;
    }
}