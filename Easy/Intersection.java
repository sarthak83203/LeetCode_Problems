//So the intersection is that something it will not repeat twice

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int len1=nums1.length;
        int len2=nums2.length;
        int index[]=new int[2];
        for(int i=0;i<len1;i++){
            for(int j=0;j<len2;j++){
                if(nums1[i]==nums2[j]){
                    index[i]=nums1[j];
                }
            }
        }
        return index;
        
    }
}