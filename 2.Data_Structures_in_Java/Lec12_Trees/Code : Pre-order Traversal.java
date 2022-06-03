	public static void printPreOrder(TreeNode<Integer> root){
        if(root==null)
        	return;
        System.out.print(root.data+" ");
        for(int i=0;i<root.children.size();i++){
        	printPostOrder(root.children.get(i));
        }
        return;
	}
