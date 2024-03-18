package gl.prob2.pairsum;

import java.util.HashSet;
import java.util.Set;

import gl.prob2.binarysearchtree.Node;

// PairSum Utility class
public class PairSumUtil {

	public void findPair(Node root, int sum) {

		Set<Integer> set = new HashSet<Integer>();
		System.out.println("Sum = " + sum);
		if (!getPairRecursive(root, sum, set)) {
			System.out.println("No pairs found");
		}
	}

	public boolean getPairRecursive(Node root, int sum, Set<Integer> set) {
		boolean pairFound = false;
		if (root == null) {
			return false;
		}

		boolean leftPairFound = getPairRecursive(root.left, sum, set);
		boolean rightPairFound = getPairRecursive(root.right, sum, set);

		if (set.contains(sum - root.data)) {
			System.out.println("Pair is: " + "(" + (sum - root.data) + "," + root.data + ")");
			pairFound = true;
		}
		set.add(root.data);
		return pairFound || leftPairFound || rightPairFound;
	}
}
