package maxdepthtree;

// Java program to find the height of a binary 
// tree using level order traversal approach.
import java.util.LinkedList;
import java.util.Queue;



 class Node2 {
	    int data;
	    Node left, right;

	    Node2(int val) {
	        data = val;
	        left = null;
	        right = null;
	    }
	}	

 class GfG2 {

	   // Function to find the height of the tree
	    static int height(Node root) {
	        if (root == null) 
	        	return 0;

	        // Initializing a variable to count 
	        // the height of the tree
	        int height = 0;

	        Queue<Node> q = new LinkedList<>();

	        // Pushing the first level element 
	        // along with null
	        q.add(root);
	        q.add(null);

	        while (!q.isEmpty()) {
	            Node curr = q.poll();

	            // When null is encountered, 
	            // increment the height
	            if (curr == null) {
	                height++;

	                // If queue still has elements left, 
	                // push null again to the queue
	                if (!q.isEmpty()) {
	                    q.add(null);
	                }
	            } 
	            else {

	                // If null is not encountered, 
	                // keep moving
	                if (curr.left != null) 
	                	q.add(curr.left);
	                if (curr.right != null) 
	                	q.add(curr.right);
	            }
	        }
	        return height - 1;
	    }//height
 }//GFG2
public class maxdepthqueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		GfG2 x= new GfG2();
		// Representation of the input tree:
        //     1
        //    / \
        //   2   3
        //  / \
        // 4   5   
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        System.out.println("height using queue: "+x.height(root));
		
	}

}
