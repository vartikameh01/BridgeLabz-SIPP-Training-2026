import java.util.ArrayList;
import java.util.List;

class BSTLeaderboard {
    public List<Integer> getSortedLeaderboard(Node root) {
        List<Integer> result = new ArrayList<>();
        inorder(root, result);
        return result;
    }

    private void inorder(Node node, List<Integer> result) {
        if (node == null) {
            return;
        }
        inorder(node.left, result);   // Visit left subtree (smaller scores)
        result.add(node.val);         // Visit current node
        inorder(node.right, result);  // Visit right subtree (larger scores)
    }
}