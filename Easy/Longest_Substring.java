import java.util.*;
public class Longest_Substring{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int nums[]=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        //Now Founding the Longest SubString
        int count=1; //Current Increasing length
        int maxcount=1; //length found So farr......
        for(int i=0;i<n-1;i++){
            if(nums[i+1]>nums[i]){
                count++;
                maxcount=Math.max(maxcount,count);
            }
            else{
                count=1;
            }

        }
        System.out.println(maxcount);
        
  
    }
}