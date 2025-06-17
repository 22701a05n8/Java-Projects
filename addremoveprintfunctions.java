public class Graph{
	private Map<Integer,List<Integer>>adjList;
	private boolean isDirected;
	public Graph(boolean isDirected){
		this.isDirected=isDirected;
		adjList=new HashMap<>();
	}
	public void addEdge(int src,int dest){
		adjList.putIfAbsent(src,new ArrayList<>());
		adjList.putIfAbsent(dest,new ArrayList<>());
		adjList.get(src).add(dest);
		if(!isDirected){
			adjList.get(dest).add(src);
		}
	}
	public void removeEdge(int src,int dest){
		List<Integer>srcList=adjList.get(src);
		List<Integer>destList=adjList.get(dest);
		if(scrList!=null)srcList.remove((Integer)dest);
		if(!isDirected&&destList!=null)destList.remove((Integer)src);
	}
	public void printGraph(){
		for(var entry:adjList.entrySet()){
			System.out.println(entry.getKey()+"->"+entry.getValue());
		}
	}
}