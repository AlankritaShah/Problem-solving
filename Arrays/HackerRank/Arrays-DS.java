// https://www.hackerrank.com/challenges/arrays-ds/problem

class Result {

    /*
     * Complete the 'reverseArray' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY a as parameter.
     */

    public static List<Integer> reverseArray(List<Integer> a) {
    // Write your code here
        int size = a.size();
        for(int i=0;i<(size/2);i++){
            int temp = a.get(i);
            a.set(i, a.get(size-i-1));
            a.set(size-i-1, temp);
        }
        return a;
    }
}
