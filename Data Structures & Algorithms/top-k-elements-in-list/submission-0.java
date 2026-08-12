class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i : nums){
            map.put(i,map.getOrDefault(i,0)+1);
            
        }
        int arr[] = new int[map.size()];
        int index = 0;
      for(Map.Entry<Integer,Integer> entry : map.entrySet()){
       
       int val = entry.getValue();
        arr[index++] = val;

      }
      Arrays.sort(arr);
      int threshold = arr[arr.length - k];
      int arr1[] = new int[k];
        int index1 = 0;
      for(Map.Entry<Integer,Integer> entry : map.entrySet()){
        if(entry.getValue() >= threshold && index1 < k) {
            arr1[index1++] = entry.getKey();
        }
      }
        return arr1;
    }
}
