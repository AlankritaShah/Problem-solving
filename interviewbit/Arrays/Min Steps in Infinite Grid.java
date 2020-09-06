/*
Problem Statement: https://www.interviewbit.com/problems/min-steps-in-infinite-grid/
*/

public class Solution {
    public int coverPoints(ArrayList<Integer> A, ArrayList<Integer> B) {
        int count = 0;
        for(int i=1;i<A.size();i++){
                count += findSteps(A.get(i-1), B.get(i-1), A.get(i), B.get(i));
        }
        return count;
    }
    
    private int findSteps(int startX, int startY, int endX, int endY){
        int x = Math.abs(startX - endX);
        int y = Math.abs(startY - endY);
        return Math.max(x, y);
    }
}
