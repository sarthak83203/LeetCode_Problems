import java.util.*;
public class Sub_tree_important{
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
            Node newNode= new Node(nodes[idx]);
            newNode.left=BuildTree(nodes);
            newNode.right=BuildTree(nodes);



            return newNode;


        }
    }

    public boolean Identical(Node p,Node q){
        if(p==null && q==null){
            return true;
        }
        if(p==null || q==null){
            return false;
        }
        if(p.data==q.data){
            return true;
        }
        return Identical(p.left,q.left) && Identical(p.right,q.right);
    }


    public boolean isSubtree(Node root,Node subroot){
        if(subroot==null){
            return true;
        }
        if(root==null){
            return false;
        }
        if(root.data==subroot.data){
            if(Identical(root,subroot)){
                return true;

            }
        }

        return isSubtree(root.left,subroot)|| isSubtree(root.right,subroot);   //if Not matching then go to left left or go to right right.....
    }

    public static void main(String args[]){
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree=new BinaryTree();
        Node root=tree.BuildTree(nodes);


    }
}