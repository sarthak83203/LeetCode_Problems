import java.util.*;
public class Diameter_Tree{
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

    public static int height(Node root){
        if(root==null){
            return 0;
        }
        int left=height(root.left);
        int right=height(root.right);
        return Math.max(left,right)+1;
    }




    public static int Diameter(Node root){
        if(root==null){
            return 0;
        }
        int dia1=Diameter(root.left);
        int dia2=Diameter(root.right);
        int dia3=height(root.left)+height(root.right) + 1; //Here +1 should be added...

        return Math.max(dia3,Math.max(dia1,dia2));

    }

    public static void main(String args[]){
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree=new BinaryTree();
        Node root=tree.BuildTree(nodes);
        int gh=Diameter(root);
        System.out.println(gh);

    }
}