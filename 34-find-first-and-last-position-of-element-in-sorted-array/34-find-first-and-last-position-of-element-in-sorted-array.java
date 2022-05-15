class Solution {
    public int[] searchRange(int[] nums, int target) {
        int i = 0;
        int j =  nums.length-1;
        int s=-1;
            int e = -1;
        while(i<nums.length){
            if(nums[i] == target ){
                s= i;
                break;
            }
            i++;
        }
         while(j>=0){
            if(nums[j]== target){
                e= j;
                break;
            }
            j--;
        }
         int arr[] = new int[2];
        arr[0]=s;
        arr[1]= e;
          return arr;
    }
}