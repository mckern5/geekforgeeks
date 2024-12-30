package binarysearchtree;



	class Node2 {
	    int data;
	    Node2 left, right;

	    Node2(int val) {
	        data = val;
	        left = right = null;
	    }
	}
	
	class GfG2 {

	    // If root is null or left is null, return root data
	    static int minValue(Node2 root) {
	      
	        // If the root is null or left child is null,
	        // return the current node's value
	        if (root == null || root.left == null) {
	            return root.data;
	        }

	        // Recursively get min value from the left subtree
	        return minValue(root.left);
	    }
	}
	
public class minvaluebstrecursive {	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GfG2 x=new GfG2();
		// Representation of input binary search tree
        //        5
        //       / \
        //      4   6
        //     /     \
        //    3       7
        //   /
        //  1
        Node2 root = new Node2(5);
        root.left = new Node2(4);
        root.right = new Node2(6);
        root.left.left = new Node2(3);
        root.right.right = new Node2(7);
        root.left.left.left = new Node2(1);

        System.out.println("BST min value using Recursion: "+x.minValue(root));  //easy to understand

	}

}
