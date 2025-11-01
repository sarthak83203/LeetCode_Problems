class solution{
    List<Integer> res=new ArrayList<>();
    public List<Integer> inoder Traversals(TreeNode root){
        traverse(root);
        return res;


    }

    void Travere(TreeNode root){
        if(root==null){
            return;
        }
        traverse(root.left);
        res.add(root.val);
        traverse(root.right);
    }
}