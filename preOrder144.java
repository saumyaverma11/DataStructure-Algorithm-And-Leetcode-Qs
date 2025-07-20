import java.util.ArrayList;
import java.util.List;

public class preOrder144 {

    // TreeNode class definition
    static class TreeNode {
        int val;
        TreeNode left, right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    // Inorder traversal helper
    public static void preorder(ArrayList<Integer> list, TreeNode root) {
     if(root==null){
            return;
        }
        list.add(root.val);
        preorder(list,root.left);
        preorder(list,root.right);
    }

    // Main inorder traversal method
    public static List<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        preorder( list,root);
        return list;
    }

    // Main method to test the traversal
    public static void main(String[] args) {
        // Sample tree:     1
        //                   \
        //                    2
        //                   /
        //                  3
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);

        List<Integer> result = preorderTraversal(root);
        System.out.println("Inorder Traversal: " + result); // Output: [1, 3, 2]
    }
}
