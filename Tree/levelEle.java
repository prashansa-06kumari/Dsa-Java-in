package Tree;

public class levelEle {
    static class TreeNode{
        int data;
        TreeNode left,right;
        TreeNode(int val){
            data = val;
            left = right = null;
        }
    }
    public static void printLevel(TreeNode root,int level){
        if(root == null) return;
        if(level == 1){
            System.out.println(root.data + " ");
        }else{
            printLevel(root.left, level - 1);
            printLevel(root.right, level - 1);
        }

    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(100);
        root.left = new TreeNode(50);
        root.right = new TreeNode(150);
        root.left.left = new TreeNode(29);
        root.left.right = new TreeNode(56);
        System.out.println("Node at leavel 2 is:");
        printLevel(root, 2);

    }
}
