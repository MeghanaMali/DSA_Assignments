class Solution {
    public int maxProduct(int[] nums) {
        int curprod=nums[0];
        int maxprod=nums[0];
        for(int i=1;i<nums.length;i++){
           if(curprod==0){
                curprod=1;
            }
            System.out.println(curprod);
            curprod=curprod*nums[i];
            System.out.println(curprod);
            maxprod=Math.max(maxprod,curprod);
            System.out.println(maxprod);
             if(curprod<0){
                curprod=1;
            }
        }
        return maxprod;
    }
}