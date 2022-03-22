package com.company;

public class Tree {
	static Node root;

	Node formattedArray(int arr[], int start, int end) {

		if (start > end) return null;

		int mid = (start + end) / 2;
		Node node = new Node(arr[mid]);

		node.left = formattedArray(arr, start, mid - 1);
		node.right = formattedArray(arr, mid + 1, end);

		return node;
	}

	 void preOrder(Node node) {
		if (node == null) {
			return;
		}
		System.out.print(node.val + " ");
		preOrder(node.left);
		preOrder(node.right);
	}

	//	for personal use only, checks if tree is balanced.
	boolean isBalanced(Node node) {
		int lh;

		int rh;

		if (node == null) return true;

		lh = height(node.left);
		rh = height(node.right);

		if (Math.abs(lh - rh) <= 1
						&& isBalanced(node.left)
						&& isBalanced(node.right))
			return true;

		return false;
	}

	int height(Node node) {
		if (node == null) return 0;
		return 1 + Math.max(height(node.left), height(node.right));
	}
}
