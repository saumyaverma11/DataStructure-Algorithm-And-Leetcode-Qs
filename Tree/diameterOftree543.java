//The diameter of tree is defined as the number of nodes on the largest path between two end nodes.


import java.util.*;

class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;

    TreeNode(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class diameterOftree543{
    public static TreeNode makeTree(Scanner sc) {
        int data = sc.nextInt();
        if (data == -1) {
            return null;
        }
        TreeNode root = new TreeNode(data);
        root.left = makeTree(sc);
        root.right = makeTree(sc);
        return root;
    }

     public static int height(TreeNode root){
        if(root==null){
            return 0;
        }
        return Math.max(height(root.left),height(root.right))+1;
    }


    public static int Better(TreeNode root){
        int res =0;
        if(root==null)return 0;
        int lh = height(root.left);
        int rh = height(root.right);
        res = Math.max(res, lh+rh+1);
        return 1 + Math.max(lh,rh);
    }
    
  public static int diameter(TreeNode root){
    if(root==null)  return 0;
    int d1 = 1 + height(root.left) + height(root.right);
    int d2 = diameter(root.left);
    int d3 = diameter(root.right);
    return Math.max(d1, Math.max(d2,d3));
  }

    public static void main(String[] args) {  
        Scanner sc= new Scanner(System.in);
        TreeNode root = makeTree(sc);
        int res = diameter(root);
        System.out.println(res);
    }
}