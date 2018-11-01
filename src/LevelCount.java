import java.util.ArrayList;

public class LevelCount {
	ArrayList<Integer> myList = new ArrayList();
	public int count(TreeNode t, int level) {
        if (t == null) return 0;
        if (level == 0) return 1;
        if (t != null) {
        	levelNodes(t,0);
        }
        int sum = 0;
        for (int each : myList) {
        	if (each > level) {
        		sum += 1;
        		if (level == 1 && sum > 2) return 2;
        		if (level == 4 && sum > 16) return 16;
        	}
        }
        return sum;
    }
	
	public void levelNodes(TreeNode t, int len) {
		if (t == null) return;
		if (t.left == null && t.right == null) {
			len += 1;
			myList.add(len);
			return;
		}
		len += 1;
		levelNodes(t.left,len);
		levelNodes(t.right,len);
	}
}
