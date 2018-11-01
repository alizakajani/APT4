import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SortedLeaves {
	ArrayList<String> leafChar = new ArrayList<>();
	public String[] values(TreeNode tree) {
        if (tree == null) return new String[0];
        if (tree.left == null && tree.right == null) {
        	leafChar.add(leafVal(tree));
        }
        else {
        	leafVals(tree);
        }
        String[] leafChars = leafChar.toArray(new String[0]);
        Arrays.sort(leafChars);
        return leafChars;
    }
	
	public String leafVal(TreeNode t) {
    	return Character.toString((char)t.info);
	}
	
	public void leafVals(TreeNode t) {
		if (t == null) return;
		if (t.left == null && t.right == null) {
			leafChar.add(leafVal(t));
			return;
		}
		leafVals(t.left);
		leafVals(t.right);
	}
}
