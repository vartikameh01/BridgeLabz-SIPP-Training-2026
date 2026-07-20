class FolderManager {
    public void deleteFolderTree(Node node) {
        if (node == null) {
            return;
        }
        deleteFolderTree(node.left);
        deleteFolderTree(node.right);
        deleteNode(node); 
    }

    private void deleteNode(Node node) {
    }
}