import java.util.*;
public class Sum_at_kth_level{
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
    public static int Sum( Node root){
        int left=Sum(root.left);
        int right=Sum(root.right);

        return left+right+root.data;
    }








   public static int sumAtLevelK(Node root, int K) {
    if (root == null) return 0;

    Queue<Node> q = new LinkedList<>();
    q.add(root);
    q.add(null); // level marker

    int level = 0;
    int sum = 0;

    while (!q.isEmpty()) {
        Node curr = q.remove();

        if (curr == null) {
            level++; // level completed

            if (level > K || q.isEmpty()) break;
            q.add(null);   // next level marker
        }
        else {
            if (level == K) {
                sum += curr.data;
            }

            if (curr.left != null) q.add(curr.left);
            if (curr.right != null) q.add(curr.right);
        }
    }

    return sum;
}


    public static void main(String args[]){
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree=new BinaryTree();
        Node root=tree.BuildTree(nodes);
        int y=level_order_kth(root);
        System.out.println(y);

    }
}