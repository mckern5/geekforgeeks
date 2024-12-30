package maxdepthtree;


//recursive approach
class Node {
	    int data; 
	    Node left, right;

	    Node(int val) {
	        data = val;
	        left = null;
	        right = null;
	    }
	}
	
class GfG {

	    // Returns height which is the number of edges
	    // along the longest path from the root node down 
	    // to the farthest leaf node.
	    static int height(Node root) {
	        if (root == null)
	            return -1;

	        // compute the height of left and right subtrees
	        int lHeight = height(root.left);
	        int rHeight = height(root.right);

	        return Math.max(lHeight, rHeight) + 1;
	    }
	
	}	
	
public class mdt {	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Representation of the input tree:
        //     1
        //    / \
        //   2   3
        //  / \
        // 4   5
		GfG x=new GfG();
		
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        System.out.println("height:" + x.height(root));

	}

}
