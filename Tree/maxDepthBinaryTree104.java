import java.util.*;

class TreeNode{
   int data;
   TreeNode left;
   TreeNode right;
   TreeNode(int data){
      this.data = data;
      this.left = null;
      this.right= null;
   }
}
public class maxDepthBinaryTree104 {
   //size means number of nodes in tree. 

   public static TreeNode makeTree(Scanner var0) {
      int var1 = var0.nextInt();
      if (var1 == -1) {
         return null;
      } else {
         TreeNode var2 = new TreeNode(var1);
         var2.left = makeTree(var0);
         var2.right = makeTree(var0);
         return var2;
      }
   }

public  static int maxDepth(TreeNode root){
        if(root==null){
            return 0;
        }
        return 1+ Math.max(maxDepth(root.left),maxDepth(root.right));
    }
   ///max from left max fron right  , both max , max with root is approach 

   

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      TreeNode var2 = makeTree(var1);
      int res = maxDepth(var2);
      System.out.println(res);
   }
}




