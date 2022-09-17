public class Solution {
    /*
        Appr: 
            - The main idea is to iterate over all the elem and keep track of max value
            - If there is any value greater than max, increment the count
            - return the count
            
            Tc: O(N)
            Sc: O(1)
    */
    public int solve(int[] A) {
        
        int len = A.length;
        int count = 1;          // we keep count = 1 since, there is no elem before A[0], and A[0] itself is adding to the output count value
        int max = A[0];         // initializing min with first elem
        
        for(int i=1; i<len; i++)    // start loop from 1 since 0th elem is already considered
            if(max < A[i])
            {
                count++;
                max = A[i];     // Update the max value
            }
                
        return count;
        
    }
}
