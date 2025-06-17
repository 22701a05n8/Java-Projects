public void dfsIterative(int start){
	Set<Integer>visited=new HashSet<>();
	Stack<Integer>stack=new Stack<>();
	stack.push(start);
	while(!stack.isEmpty()){
		int vertex=stack.pop();
		if(!visited.contains(vertex)){
			visited.add(vertex);
			System.out.print(vertex+"");
			for(int neighbor:adjList.getOrDefault(vertex,new ArrayList<>())){
				if(!visited.contains(neighbor)){
					stack.push(neighbor);
				}
			}
		}
	}
}