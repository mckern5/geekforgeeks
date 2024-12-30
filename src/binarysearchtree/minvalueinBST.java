package binarysearchtree;

import java.util.ArrayList;


	
	class Node {
	    int data;
	    Node left, right;

	    Node(int val) {
	        data = val;
	        left = right = null;
	    }
	}
	
	class GfG {

	    static void inorder(Node root, ArrayList<Integer> sortedInorder) {
	      
	        // Base Case
	        if (root == null) return;

	        // Traverse left subtree
	        inorder(root.left, sortedInorder);

	        // Store the current node's data
	        sortedInorder.add(root.data);

	        // Traverse right subtree
	        inorder(root.right, sortedInorder);
	    }

	    static int minValue(Node root) {
	      
	        if (root == null) {
	            return -1;
	        }

	        // Create an ArrayList to hold inorder elements
	        ArrayList<Integer> sortedInorder = new ArrayList<>();

	        // Call the recursive inorder function
	        inorder(root, sortedInorder);

	        // Return the first element, which is the minimum
	        return sortedInorder.get(0);
	    }

	} //gfg

public class minvalueinBST {	
	
	public static void main(String[] args) {
		// Representation of input binary search tree
        //        5
        //       / \
        //      4   6
        //     /     \
        //    3       7
        //   /
        //  1
		GfG x=new GfG();
		
        Node root = new Node(5);
        root.left = new Node(4);
        root.right = new Node(6);
        root.left.left = new Node(3);
        root.right.right = new Node(7);
        root.left.left.left = new Node(1);

        System.out.println(x.minValue(root));
	}

}
