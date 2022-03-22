package com.company;

class Node {
//	Node parent;
	Node left, right;
	int val;

	public Node(int v) {
		val = v;
		left = right = null;
	}

	public void traverseLeft (Node root){
		if (root.left != null){
			traverseLeft (root.left);
		}
		System.out.println(root.val);

	}

	public void traverseRigth(Node root){

		if (root.right != null){

			traverseRigth (root.right);

		}
		System.out.println(root.val);

	}
}