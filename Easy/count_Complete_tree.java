public int CountNodes(TreeNodes root){
    if(root==null){
        return 0;
    }
    else{
        return 1+CountNodes(root.left)+CountNodes(root.right);
    }
}