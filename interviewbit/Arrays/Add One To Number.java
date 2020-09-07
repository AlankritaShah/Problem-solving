public class Solution {
    public int[] plusOne(int[] A) {
        
        A[A.length - 1] = A[A.length - 1] + 1;
        int carry = A[A.length - 1]/10;
        A[A.length - 1] = A[A.length - 1]%10;
        
        for(int i=A.length-2;i>=0;i--){
            if(carry == 1){
                A[i] = A[i] + 1;
                carry = A[i]/10;
                A[i] = A[i]%10;
            }
        }
        int[] res;
        if(carry == 1){
            res = new int[A.length + 1];
            res[0] = 1;
            for(int i=1;i<A.length+1;i++) res[i] = A[i - 1];
            return res;
        }
 
        int i = 0;
        while(i<A.length && A[i]==0){
            i++;
        }
        res = new int[A.length - i];
        for(int j= i;j<A.length;j++){
            res[j-i] = A[j];
        }
        return res;
    }
}
