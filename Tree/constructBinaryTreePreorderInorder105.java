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


public class constructBinaryTreePreorderInorder105 {
    public static TreeNode makeTree( Scanner sc ){
        int data = sc.nextInt();
        if(data == -1) return null;
        TreeNode root = new TreeNode(data);
        root.left = makeTree(sc);
        root.right = makeTree(sc);
        return root;
    }

    static int preIndex =0;
    public static TreeNode construct(int in[], int pre[], int  si , int ei){
        if(si>ei)  return null;
        TreeNode root = new TreeNode(pre[preIndex++]);
        int inFoundIndex=0;
        for(int i=si;i<=ei;i++){
            if(in[i]== root.data){
                inFoundIndex = i;
                break;
            }
        }
        root.left = construct(in, pre, si, inFoundIndex-1);
        root.right = construct(in, pre, inFoundIndex+1, ei);
        return root;
    }

    public static void Inorder(TreeNode root){
        if(root!=null){
            Inorder(root.left);
            System.out.print(root.data + " ");
            Inorder(root.right);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int in[]= {20,10,40,30,50};
        int pre[]= {10,20,30,40,50};
        TreeNode constructNode=  construct(in,pre, 0, in.length-1 );
        Inorder(constructNode);
    }
}