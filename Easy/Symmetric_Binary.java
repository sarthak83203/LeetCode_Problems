public solution{
    public boolean issymmetric(TreeNode root){
        if(root==null){
            return true; //As if root is a null then it is symmetric
        }
        return isMirror(root.left,root.right);
    }
    public isMirror(TreeNode p,TreeNode q){
        if(p==null && q==null){
            return true;
        }
        if(p==null || q==null){
            return false;
        }
        return (p.val==q.val) && isMirror(p.left,q.right) && isMirror(p.right,q.left);
    }
}