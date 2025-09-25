import java.util.ArrayList;
import java.util.List;

public class disappered_in_array {
public List<Integer> findDisappearedNumbers(int[] nums) {
        boolean[] seen=new boolean[nums.length+1];
        List<Integer> missing=new ArrayList<>(); //dynamic memory allocation..
        for(int num:nums){
            seen[num]=true; //marks as appeared....
        }
        for(int i=1;i<=nums.length;i++){
            if(!seen[i]){
                missing.add(i);
            }
           
        }
        return missing;
        
    }
    
}
