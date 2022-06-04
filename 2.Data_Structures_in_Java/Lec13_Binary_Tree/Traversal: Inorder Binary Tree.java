public static void InOrder(BinaryTreeNode<Integer> root) {
		if(root==null)
            return;
        InOrder(root.left);
        System.out.print(root.data+" ");
        InOrder(root.right);   
	}
