import java.util.Arrays;

public class cokiee_children {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int cokiee=0;
        int satisfied=0;
        int children=0;
        while(cokiee<s.length && children<g.length){
            if(s[cokiee]>=g[children]){
                cokiee++;
                satisfied++;
                children++;
            }else{
                cokiee++;
            }
        }
        return satisfied;
        
    }
}
