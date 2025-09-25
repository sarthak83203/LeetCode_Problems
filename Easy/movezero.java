
//Like i am given with Array [0,1,2,0,3] i want to resite all the zero to right...
import java.util.*;
public class movezero {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int j=0;
        for(int i=0;i<n;i++){
            if(arr[i]!=0){ //if the element is not zero keep swappig..... it will automatically get at the last 
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j++;

            }
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }



}
