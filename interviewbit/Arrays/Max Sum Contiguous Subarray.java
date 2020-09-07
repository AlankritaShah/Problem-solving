public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int maxSubArray(final int[] A) {
        int max = A[0];
        int sum = A[0];
        for(int i=1;i<A.length;i++){
            sum += A[i];
            if(sum < A[i]){
                sum = A[i];
            }
            if(sum > max){
                max = sum;
            }
        }
        return max;
    }
}
