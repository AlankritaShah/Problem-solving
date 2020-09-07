public class Solution {
    public ArrayList<Integer> flip(String A) {
        Integer l = 0, lmax=-1, rmax=-1, curr = 0, max0 = 0;
        
        for(int i=0;i<A.length();i++){
            curr = A.charAt(i) == '0'? curr+1 : curr-1;
            
            if(curr > max0){
                max0 = curr;
                lmax = l;
                rmax = i;
            }
            
            if(curr < 0){
                curr = 0;
                l = i+1;
            }
        }
        
        if(lmax != -1 && rmax != -1) {
            return new ArrayList<Integer>() {{
                add(lmax);
                add(rmax);
            }};
        }
        return new ArrayList<>();
    }
}
