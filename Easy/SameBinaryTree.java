class Solution{
    public boolean isSame(TreeNode p,TreeNode q){
        return check(p,q);
    }
    public boolean check(TreeNode p,TreeNode q){
        if(p==null && q==null){
            return true;

        }
        if(p==null || q==null){
            return false;
        }
        if(p.val==q.val){
            return true;
        }

        return check(p.left,q.left) && check(p.right,q.right);
    }
}