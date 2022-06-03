import java.util.*;

public class Basic {

	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		treenode<Integer> root=takeinput(sc);
//		printtree(root);
		treenode<Integer> root=takeinputlevelwise();
		printlevelwise(root);
	}
	private static void printlevelwise(treenode<Integer> root) {
		
		QueueUsingLL<treenode<Integer>> pendingNodes = new QueueUsingLL<>();
		pendingNodes.enqueue(root);
		while(!pendingNodes.isEmpty()) {
			try {
				String s="";
				treenode<Integer> frontNode = pendingNodes.dequeue();
				s=s+ frontNode.data+":";
				for(int i=0;i<frontNode.children.size();i++) {
					s=s+frontNode.children.get(i).data+",";
					pendingNodes.enqueue(frontNode.children.get(i));
				}
				System.out.println(s);
			} catch (QueueEmptyException e) {
				return;
			}
		}
		
	}
	private static treenode<Integer> takeinputlevelwise() {
		System.out.println("Enter root data");
		Scanner sc=new Scanner(System.in);
		int rootdata=sc.nextInt();
		QueueUsingLL<treenode<Integer>> pendingNodes = new QueueUsingLL<>();
		treenode<Integer> root = new treenode<Integer>(rootdata);
		pendingNodes.enqueue(root);
		while(!pendingNodes.isEmpty()) {
			try {
				treenode<Integer> frontNode = pendingNodes.dequeue();
				System.out.println("Number of children of:"+ frontNode.data);
				int child=sc.nextInt();
				for(int i=0;i<child;i++) {
					System.out.println("Enter " + (i + 1) + "th child of " + frontNode.data);
					int node=sc.nextInt();
					treenode<Integer> childnode=new treenode<Integer>(node);
					frontNode.children.add(childnode);
					pendingNodes.enqueue(childnode);
				}
			} catch (QueueEmptyException e) {
				return null;
			}
		}
		return root;
	}
	private static treenode<Integer> takeinput(Scanner sc) {
		System.out.println("Enter root data");
		int rootdata=sc.nextInt();
//		if(rootdata==-1)
//			return null;
		treenode<Integer> root=new treenode<Integer>(rootdata);
		System.out.println("Enter no of children for "+ rootdata);
		int childcount=sc.nextInt();
		for(int i=0;i<childcount;i++) {
			treenode<Integer> child=takeinput(sc);
			root.children.add(child);
		}
		return root;
	}
	private static void printtree(treenode<Integer> root) {
		if(root==null)
			return;
		String s=root.data+":";
		for(int i=0;i<root.children.size();i++) {
			s=s+root.children.get(i).data+",";
		}
		System.out.println(s);
		for(int i=0;i<root.children.size();i++) {
			printtree(root.children.get(i));
		}
//		System.out.println(root.data);
//		for(treenode<Integer> child:root.children) {
//			printtree(child);
//		}
	}
}
