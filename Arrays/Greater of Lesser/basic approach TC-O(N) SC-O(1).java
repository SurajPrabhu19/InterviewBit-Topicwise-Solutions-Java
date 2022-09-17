public class Solution {
    public int solve(int[] A, int[] B, int target) {
        int count_in_A = 0, count_in_B = 0;
        
        // counting numbers greater than target in A
        for(int num: A)
            if(num > target)
                count_in_A++;
    
        // counting numbers less than target in B
        for(int num: B)
            if(num < target)
                count_in_B++;
                
        // finally returning the max value
        return Math.max(count_in_A, count_in_B);
    }
}
