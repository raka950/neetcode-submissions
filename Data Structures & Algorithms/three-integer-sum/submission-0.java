class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
       List <List<Integer>> outer = new ArrayList<>();
       Arrays.sort(nums);

        int len = nums.length;
        for(int i = 0; i<len; i++){
            for(int j = i+1; j<len; j++){
                for(int k = j+1;k<len;k++){
                    if(nums[i]+nums[j]+nums[k] == 0){
                        List<Integer> inner = new ArrayList<>();
                        inner.add(nums[i]);
                        inner.add(nums[j]);
                        inner.add(nums[k]);
 Collections.sort(inner); // 2️⃣ normalize order

                        if (!outer.contains(inner)) { // 3️⃣ remove duplicates
                            outer.add(inner);
                        }

                    }
                }
            }
        }

        return outer;
        
    }
}
