import java.util.ArrayList;

public class PathSum {
	ArrayList<Integer> myList = new ArrayList();
	public int hasPath(int target, TreeNode tree){
		if (tree != null) {
			doPaths(tree,0);
		}
		for (int each : myList) {
			if (each == target) return 1;
		}
        return 0;
    }
	
	public void doPaths(TreeNode root, int sum) {
		if (root == null) return;
		if (root.left == null && root.right == null) {
			sum += root.info;
			myList.add(sum);
			return;
		}
		sum += root.info;
		doPaths(root.left,sum);
		doPaths(root.right,sum);
	}
}
