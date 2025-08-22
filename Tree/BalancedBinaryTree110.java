import java.util.*;

public class BalancedBinaryTree110 {
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
        if(root ==null) return 0;
        return Math.max(height(root.left) , height(root.right)) +1;
    }
    public static boolean isBalanced(TreeNode root) {
        if(root==null) return true;
        int lh = height(root.left);
        int rh = height(root.right);
        return ((Math.abs(lh-rh)) <=1 && isBalanced(root.left) && isBalanced(root.right));
    }
      public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      TreeNode tree = makeTree(sc);
      boolean res = isBalanced(tree);
      System.out.println(res);
    }
}

