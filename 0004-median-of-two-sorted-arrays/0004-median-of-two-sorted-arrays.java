class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m=nums1.length, n=nums2.length;
        List<Integer> mer=new ArrayList<>();
        int i=0,j=0;
        while(i<m && j<n){
            if(nums1[i]<nums2[j]){
                mer.add(nums1[i++]);
            }else{
                mer.add(nums2[j++]);
            }
        }
        while(i<m)
        mer.add(nums1[i++]);
        while(j<n)
        mer.add(nums2[j++]);
        int mid=mer.size()/2;
        if(mer.size()%2==0){
            return (mer.get(mid-1)+mer.get(mid))/2.0;
        } else{
            return (mer.get(mid));
        }
   }
}