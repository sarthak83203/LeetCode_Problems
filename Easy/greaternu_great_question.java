public class greaternu_great_question {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int len1=nums1.length;
        int len2=nums2.length;
        int result[]=new int[len1];
        for(int i=0;i<len1;i++){
            int greater=-1;
            int value=nums1[i];
            boolean found=false;
            for(int j=0;j<len2;j++){
                if(nums1[i]==nums2[j]){
                    found=true;
                   
                }
                if(found && nums2[j]>value){
                    greater=nums2[j];
                    break;

                }
            }
            result[i]=greater;

        }
        return result;
        
    }
    
}
