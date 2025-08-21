import java.util.*;

public class rootEqualsSumOfChildrem2236 {
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

    
     public static boolean checkTree(TreeNode root) {
        if(root==null){
            return true;
        }
        int sum=0;
        if(root.left!=null){
            sum= sum + root.left.data;
        }
        if(root.right!=null){
            sum= sum + root.right.data;
        }

        return (sum== root.data);
    }

      public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      TreeNode tree = makeTree(sc);
      boolean res = checkTree(tree);
      System.out.println(res);
    }
}

