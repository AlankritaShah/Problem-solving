public class Solution {
    public int solve(int A, ArrayList<Integer> B) {
        int total = 0;
        
        for(int i=0;i<A;i++){
            total += B.get(i);
        }
        
        if(total % 3 != 0) return 0;
        total /= 3;
        
        int[] count = new int[A];
        
        int sum = 0;
        for(int i=A-1;i>=0;i--){
            sum += B.get(i);
            count[i] = sum == total? 1:0;
        }
        
        for(int i=1;i<A;i++){
            count[i] += count[i-1];
        }
        
        int ans = 0;
        sum = 0;
        
        for(int i=0;i<A-1;i++){
            sum += B.get(i);
            if(sum == total) ans += count[A-1] - count[i+1];
        }
        
        return ans;
    }
}
