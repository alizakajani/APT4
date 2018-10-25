
public class HeightLabel {
	public TreeNode rewire(TreeNode t) {
        if (t == null) return null;
        return new TreeNode(height(t), rewire(t.left), rewire(t.right));
    }
	
	public int height(TreeNode root) {
		if (root == null) return 0;
		else {
			return 1 + Math.max(height(root.left), height(root.right));
		}
	}
}
