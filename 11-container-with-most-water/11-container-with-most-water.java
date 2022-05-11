class Solution {
    public int maxArea(int[] h) {
     
        int vol=0;
        int max =0;
    
       int i=0;
            int j=h.length-1;
            while(j>i){
                
            
            if(h[i]<h[j]){
                vol= h[i]*(j-i);
                if(vol>max){
                    max=vol;
                }
              i++;
                   
            }
            else{
                vol= h[j]*(j-i);
                if(vol>max){
                    max=vol;
                }
                j--;
                
            }
            }
       
        return max;
        
        
        
        
        
        
        
        
        
        
        
//         if(height[height.length-1]== height[height.length-2]){
//             return height[height.length-1]*height[height.length-1];
//         }
//         if(height.length==0){
//             return 0;
//         }
//         Set<Integer> set = new HashSet<>();
  
//         for (int i =0; i<height.length; i++) {
//             set.add(height[i]);
//         }
  
        
//         Integer[] array = set.toArray( new Integer[set.size()] );
        
        
        
//         if(array.length ==1){
//             return 1;
//         }
//         else{

//         return array[array.length-2]*array[array.length-2];
//         }
        }
}