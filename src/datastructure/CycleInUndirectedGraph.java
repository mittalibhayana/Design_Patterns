package datastructure;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CycleInUndirectedGraph {

	private int vertex;
	private List<ArrayList<Integer>> list;

public CycleInUndirectedGraph(int vertex){
	this.vertex = vertex;
list =new ArrayList<ArrayList<Integer>>();
	for(int i=0;i<vertex;i++) {
		list.add(new ArrayList<>());
	}
}

public void addEdge(int src, int dest) {
	list.get(src).add(dest);
	list.get(dest).add(src);
}


public static void main(String[] args) {
	CycleInUndirectedGraph g1 = new CycleInUndirectedGraph(5);
	
	 g1.addEdge(1, 0); 
     g1.addEdge(0, 2); 
     g1.addEdge(2, 1); 
     g1.addEdge(0, 3); 
     g1.addEdge(3, 4); 
     
     if (g1.isCyclic()) {
    	 System.out.println("Cycle Foundssssssssssssssssssss");
     }
}

private boolean isCyclic() {
	boolean[] visited = new boolean[5];
    visited[0] = true;
	for(int i=0;i< vertex;i++) {
		if(!visited[i]) {
		return isCyclicUtil(0,-1,visited);
	}
	}
	return false;
}

private boolean isCyclicUtil(int src, int parent,boolean[] visited) {
	
	Iterator<Integer> itr = list.get(src).iterator();
	while(itr.hasNext()) {
		int i = itr.next();
		
		if(!visited[i]) {
			visited[i]=true;
			return isCyclicUtil(i,src,visited);
		} else if(i != parent) {
			return true;
		}
	}
	return false;
}
}
