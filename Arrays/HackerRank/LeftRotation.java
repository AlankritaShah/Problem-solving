// https://www.hackerrank.com/challenges/array-left-rotation/problem

class Result {

    /*
     * Complete the 'rotateLeft' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER d
     *  2. INTEGER_ARRAY arr
     */

    public static List<Integer> rotateLeft(int d, List<Integer> arr) {
    // Write your code here
        List<Integer> rotArr = new ArrayList<>();
        for(int i=0;i<arr.size();i++){
            int itemPos = (i+d)%arr.size();
            rotArr.add(i, arr.get(itemPos));
        }
        return rotArr;
    }

}
