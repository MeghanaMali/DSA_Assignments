class Solution {
    public int findMin(int[] nums) {
       int N=nums.length-1;
       int start=0, end=N;

       while(start<end){
          int mid=(start)+(end-start)/2;
          /*if(nums[start]<=nums[end]){
            return nums[start];
          }
          if(nums[mid]==nums[start] && nums[mid]==nums[end]){
            start++;
            end--;
            continue;
          }
          int next=(mid+1)%N;
          int prev=(mid+N-1)%N;
          if(nums[mid]<nums[next] && nums[mid]<nums[prev]){
            return nums[mid];
          }

          if(nums[start]<=nums[mid]){
            start=mid+1;
          }else if(nums[mid]<=nums[end]){
           end=mid-1;
          }else{
            end--;
          } */

          if(nums[mid]>nums[end]){
               start=mid+1;   
          }else if(nums[mid]<nums[end]){
            end=mid;
          } else{
              end--;        
          }
         
       }
        return nums[start];
    
    }
}