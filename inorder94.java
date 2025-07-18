import java.util.ArrayList;
import java.util.List;

public class inorder94 {

    // TreeNode class definition
    static class TreeNode {
        int val;
        TreeNode left, right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    // Inorder traversal helper
    public static void inorder(TreeNode root, ArrayList<Integer> list) {
        if (root == null) return;
        inorder(root.left, list);
        list.add(root.val);
        inorder(root.right, list);
    }

    // Main inorder traversal method
    public static List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        inorder(root, list);
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

        List<Integer> result = inorderTraversal(root);
        System.out.println("Inorder Traversal: " + result); // Output: [1, 3, 2]
    }
}
