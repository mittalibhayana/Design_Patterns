package datastructure;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ShortestPathAlgo {

	private int vertex;
	private List<ArrayList<Integer>> list;

	public ShortestPathAlgo(int vertex) {
		this.vertex = vertex;
		list = new ArrayList(new ArrayList<Integer>());

		for (int i = 0; i < vertex; i++) {
			list.add(new ArrayList<Integer>());
		}
	}

	private void addEdge(int src, int dest) {
		list.get(src).add(dest);
	}

	public boolean BFS(int src, int dest, int[] dist, int[] parent) {
		boolean visited[] = new boolean[vertex];
		
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.add(src);
		visited[src] = true;
		dist[src] = 0;

		while (!queue.isEmpty()) {
			src = (int) queue.poll();

			Iterator<Integer> itr = list.get(src).iterator();

			while (itr.hasNext()) {
				int i = itr.next();
				if (!visited[i]) {
					visited[i] = true;
					dist[i] = dist[src] + 1;
					parent[i] = src;
					queue.add(i);
					if (i == dest) {
						return true;
					}
				}
			}

		}

		
		return false;
	}

	public static void main(String[] args) {
		ShortestPathAlgo g = new ShortestPathAlgo(8);
		g.addEdge(0, 1);
		g.addEdge(0, 3);
		g.addEdge(1, 2);
		g.addEdge(3, 4);
		g.addEdge(3, 7);
		g.addEdge(4, 5);
		g.addEdge(4, 6);
		g.addEdge(4, 7);
		g.addEdge(5, 6);
		g.addEdge(6, 7);
		
		int[] dist = new int[8];
		Arrays.fill(dist, -1);
		int[] parent = new int[8];
		Arrays.fill(parent, -1);
		g.BFS(0, 7,dist,parent);
		int dest = 7;
		
		
		List<Integer> list = new ArrayList<>();
		list.add(dest);
		
		 while (parent[dest] != -1) { 
			 list.add(parent[dest]); 
		        dest = parent[dest]; 
		    } 
		 Collections.reverse(list);
		 for(Integer i :list) {
			 System.out.println(i+" ");
		 }
		  
		 
}
}
