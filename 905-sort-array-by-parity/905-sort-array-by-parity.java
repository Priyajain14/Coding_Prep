class Solution {
    public void swap(int a , int b){
        int temp = a;
        a=b;
        b=temp;
        
    }
    public int[] sortArrayByParity(int[] nums) {
        int temp;
        for(int i =0; i<nums.length; i++){
            for(int j =nums.length-1; j>=0;j--){
                if(nums[i]%2!=0 && nums[j]%2==0 && i<j){
                    temp=nums[i];
                    nums[i]= nums[j];
                    nums[j]=temp;
                }
            }
        }
        
        
        
        
        
        
        
        return nums;
    }
}