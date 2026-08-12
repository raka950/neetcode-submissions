class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int arr[] = new int[2];
        int index =0;
        int len = numbers.length;

        for(int i = 0; i<len; i++ ){
            for(int j = i+1; j<len;j++){
                if(numbers[i]+ numbers[j] == target ){
                    arr[index++] = i+1;
                    arr[index++] = j+1;
                }
            }
        }
        return arr;
    }
}
