
//Important Always go with false condition....
import java.util.*;
public class isVailid_Binary_tree{
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
            Node newNode=new Node(nodes[idx]);
            newNode.left=BuildTree(nodes);
            newNode.right=BuildTree(nodes);

            return newNode;
        }
    }
    static long  prev=Long.MIN_VALUE;
    public static  boolean isValid(Node root){

        if(root==null){
            return true;        //Yes it is Valid tree Only....
        }
         if(!isValid(root.left)){ //going to left
            return false;
        }
       
        if(root.data<=prev){
            return false;
        }
        
        prev=root.data;
        return isValid(root.right);

    }

    public static void main(String args[]){
        int nodes[]={5,1,-1,-1,4,3,-1,-1,6,-1,-1};
        BinaryTree tree=new BinaryTree();
        Node root=tree.BuildTree(nodes);
        boolean tr=isValid(root);
        System.out.println(tr);


    }
}