import java.util.*;

class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int val) {
        this.val = val;
        this.left = this.right = null;
    }
}

class NodeQueue {
    private List<TreeNode> list = new ArrayList<>();

    public void enqueue(TreeNode node) {
        list.add(node);
    }

    public TreeNode dequeue() {
        if (isEmpty()) return null;
        return list.remove(0);
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }
}

public class BinaryTree {
    public static List<Integer> levelOrder(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) return result;

        NodeQueue queue = new NodeQueue();
        queue.enqueue(root);

        while (!queue.isEmpty()) {
            TreeNode current = queue.dequeue();
            result.add(current.val);

            if (current.left != null) queue.enqueue(current.left);
            if (current.right != null) queue.enqueue(current.right);
        }
        return result;
    }

    public static void main(String[] args) {
        
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(20);
        root.right = new TreeNode(30);
        root.left.left = new TreeNode(40);
        root.left.right = new TreeNode(50);
        root.right.right = new TreeNode(60);

        List<Integer> result = levelOrder(root);
        System.out.println(result); 
    }
}
