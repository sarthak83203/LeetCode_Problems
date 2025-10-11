class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        int minSum=Integer.MAX_VALUE;
       String [] temp=new String[Math.min(list1.length,list2.length)];
       int count=0;
         for(int i=0;i<list1.length;i++){
            for(int j=0;j<list2.length;j++){
                if(list1[i].equals(list2[j])){
                    int sum=i+j;
                    if(sum<minSum){
                        minSum=sum;
                        count=0;
                        temp[count++]=list1[i];

                    }else if(sum==minSum){
                        temp[count++]=list1[i];

                        
                    }
                }
            }
         }
         String [] result=new String[count];
         for(int i=0;i<count;i++){
            result[i]=temp[i];
         }
         return result;

         
    }
}