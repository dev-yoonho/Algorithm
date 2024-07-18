import java.util.ArrayList;

class Solution {
    public int[] solution(int l, int r) {
        ArrayList<Integer> res = new ArrayList<>();
        for (int i = l; i <= r;i++) {
            if (isValid(i)) {
                res.add(i);
            }
        }

        return res.size() > 0 ? res.stream().mapToInt(Integer::intValue).toArray():new int[]{-1};
    }
    
    private boolean isValid(int num) {
        while (num > 0) {
            if (num % 10 != 5 && num % 10 != 0) {
                return false;
            }
            num /= 10;
        }
        return true;
    }
}

