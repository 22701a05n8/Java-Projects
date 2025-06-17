import void BFS(int start){
	Set<Integer>visited=new HashSet<>();
	Queue<Integer>queue=new LinkedList<>();
	visited.add(start);
	queue.add(start);
	while(!queue.isEmpty()){
		int vertex=queue.poll();
		System.out.print(vertex+"");
		for(int neighbor:adjList.getOrDefault(vertex,new ArrayList<>()){
			if(!visited.contains(neighbor)){
				visited.add(neighbor);
				queue.add(neighbor);
			}
		}
	}
}