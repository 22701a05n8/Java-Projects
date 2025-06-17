static class Node{
	int data;
	Node left,right;
	Node(int item){
		data=item;
		left=right=null;
	}
}
void InOrder(Node root){
	if(root==null)return;
	InOrder(root.left);
	System.out.print(root.data+"");
	inOrder(root.right);
}
void PreOrder(Node root){
	if(root==null)return;
	System.out.print(root.data+"");
	PreOrder(root.left);
	PreOrder(root.right);
}
void PostOrder(Node root){
	if(root==null)return;
	PostOrder(root.left);
	PostOrder(root.right);
	System.out.print("root.data+"");
}
void LevelOrder(Node root){
	if(root==null)return;
	Queue<Node>queue=new LinkedList<>();
	queue.add(root);
	while(!queue.isEmpty()){
		Node current=queue.poll();
		System.out.print(current.data+"");
		if(current.left!=null)queue.add(current.left);
		if(current.right!=null)queue.add(current.right);
	}
}