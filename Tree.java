public class Tree {
    TreeNode root;
    public TreeNode inserLevelorder(int[] arry,TreeNode root, int i){
        if(i < arry.length){
            TreeNode tr = new TreeNode(arry[i]);
            root = tr;
            root.left = inserLevelorder(arry,root.left,2*i*1);
            root.right = inserLevelorder(arry,root.right,2*i*2);
        }
        return  root;
    }
    public  void inorder(TreeNode node){
        if(node != null){
            System.out.println(node.left);
            System.out.println(node.data);
            System.out.println(node.right);
        }
    }
    public void preorder(TreeNode node){
        if(node != null){
            System.out.println(node.data);
            System.out.println(node.left);
            System.out.println(node.right);
        }
    }
    public void postorder(TreeNode node){
        if(node != null){
            System.out.println(node.left);
            System.out.println(node.right);
            System.out.println(node.data);
        }
    }
    

}
class TreeNode{
    int data;
    TreeNode left;
     TreeNode right ;
     TreeNode(int data){
         this.data = data;
         this.left = null;
         this.right = null;
     }
}