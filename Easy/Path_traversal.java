/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> arr=new ArrayList<>();
        traversal(root,"",arr);
        return arr;

        
    }

    public static void traversal(TreeNode root,String path,List<String> arr){
        if(root==null){
            return;
        }
       path=path+root.val; //all the nodes get added here
       //I want ot add the string so taking path as string....

       if(root.left==null && root.right==null){
         arr.add(path); //Now here path is ending
        //  return;
       }

       traversal (root.left,path+"->",arr);
       traversal(root.right,path+"->",arr);





        


    }
}