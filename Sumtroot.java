public class Sumtroot{
 boolean found = false;
    public void path(TreeNode root, int res, int targetSum){
        if(root==null){
            return;
        }
        res= res + root.val;


        if(root.left ==null && root.right ==null && res == targetSum ){
            found = true;
            return;
        }
        path(root.left,res,targetSum);
        path(root.right,res,targetSum);
     

    }
    public boolean hasPathSum(TreeNode root, int targetSum) {
        int res=0;
        path(root,res,targetSum);
        return found;
    }
}