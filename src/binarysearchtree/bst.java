package binarysearchtree;

public class bst {
	
	
	static class Node{
		int data;
		Node left, right;
		Node(int d){
			data=d;
			left=null;
			right=null;
		}
	}
	
	public static void main(String[] args) {
		Node firstNode=new Node(2);
		Node secondNode=new Node(3);
		Node thirdNode=new Node(4);
		Node fourthNode=new Node(5);
		
		firstNode.left=secondNode;
		firstNode.right=thirdNode;
		
		secondNode.left=fourthNode;
	}
	

}
