class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        HashSet<List<Integer>> az = new HashSet<>();
        Arrays.sort(nums);
        for(int i=0; i <nums.length-2;i++){
            int j = i+1;
            int k = nums.length-1;
            while(j<k){
                if(nums[i]+nums[j]+nums[k]  == 0){
                    List<Integer> ls = new ArrayList<>();
                    ls.add(nums[i]);
                    ls.add(nums[j]);
                    ls.add(nums[k]);
                    j++;
                    k--;
                    az.add(ls);
                }
                else if(nums[i]+nums[j]+nums[k] < 0){
                    j++;
                }
                else{
                    k--;
                }
            }
        }
        return new ArrayList<>(az);
    }
}