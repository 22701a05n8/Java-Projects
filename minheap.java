import java.util.*;
public class MinHeap{
	private ArrayList<Integer>heap;
	public MinHeap(){
		heap=new ArrayList<>();
	}
	private void swap(int i,int j){
		int temp=heap.get(i);
		heap.set(i,heap.get(j));
		heap.set(j,temp);
	}
	public void insert(int val){
		heap.add(val);
		int i=heap.size()-1;
		while(i>0&&heap.get(i)<heap.get((i-1)/2)){
			swap(i,(i-1)/2);
			i=(i-1)/2;
		}
	}
	public int removeMin(){
		if(heap.size()==0)return -1;
		int min=heap.get(0);
		heap.set(0,heap.remove(heap.size()-1));
		heapify(0);
		return min;
	}
	private void heapify(int i){
		int smallest=i;
		int i=2*i+1;
		int r=2*i+2;
		if(i<heap.size()&&heap.get(i)<heap.get(smallest))smallest=i;
		if(r<heap.size()&&heap.get(r)<heap.get(smallest))smallest=r;
		if(smallest!=i){
			swap(i,smallest);
			heapify(smallest);
		}
	}
	public void print(){
		System.out.println(heap);
	}
}