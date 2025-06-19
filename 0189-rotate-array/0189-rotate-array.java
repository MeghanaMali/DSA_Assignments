class Solution {
    
    public void rotate(int[] nums, int k) {
        int temp=0;
       for(int d=0;d<k;d++){
         temp=nums[nums.length-1];
        for(int i=nums.length-1; i>0; i--){
           
            nums[i]=nums[i-1];
             
           }
           nums[0]=temp;
       }   
                  
       
    }
}