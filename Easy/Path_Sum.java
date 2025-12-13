import java.util.*;
public class Path_Sum{
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    static class BinaryTree{
        static int idx=-1;
        public static Node BuildTree(int nodes[]){
            idx++;
            if(nodes[idx]==-1){
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left=BuildTree(nodes);
            newNode.right=BuildTree(nodes);

            return newNode;
        }
    }


    //Now i want to do about the Path_Sum Function in which the target sum will be given to me 

    public static boolean Path(Node root,int targetSum){
        if(root==null){
            return false;
        }

        if(root.left==null && root.right==null){
            return targetSum==root.data;
        }

        return Path(root.left,targetSum-root.data) || Path(root.right,targetSum-root.data);
    }
    public static void main(String args[]){
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree=new BinaryTree();
        Node root=tree.BuildTree(nodes);
        int targetSum=22;
        boolean de=Path(root,targetSum);
        System.out.println(de);

    }
}