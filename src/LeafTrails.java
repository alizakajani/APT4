import java.util.ArrayList;
import java.util.TreeMap;

public class LeafTrails {
	TreeMap<Integer,String> myMap = new TreeMap<Integer,String>();
	public String[] trails(TreeNode tree) {
        ArrayList<String> binTrails = new ArrayList<>();
		if (tree != null) {
        	if (tree.left != null) {
            	doPaths(tree.left,"","0");
        	}
        	if (tree.right != null) {
        		doPaths(tree.right,"","1");
        	}
        }
		
        for (int leaf : myMap.keySet()) {
        	binTrails.add(myMap.get(leaf));
        }
        String [] binTrails2 = binTrails.toArray(new String[0]);
        return binTrails2;
    }
	
	public void doPaths(TreeNode root, String bin1, String bin2) {
		String next = bin1.concat(bin2);
		if (root == null) return;
		if (root.left == null && root.right == null) {
			myMap.putIfAbsent(root.info, next);
		}
		doPaths(root.left, next, "0");
		doPaths(root.right, next, "1");
	}
}
