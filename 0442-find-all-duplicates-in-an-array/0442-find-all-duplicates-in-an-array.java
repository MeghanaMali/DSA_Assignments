class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> ans=new ArrayList<>();
        HashMap<Integer, Integer> hm=new HashMap<>();
       for(int i=0;i<nums.length;i++){
            hm.put(nums[i], hm.getOrDefault(nums[i],0)+1);
       }
       for(int n:hm.keySet()){
        if(hm.get(n)==2)
        ans.add(n);
       }
        return ans;

    }
}