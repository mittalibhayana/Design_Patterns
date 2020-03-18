package datastructure;

import java.util.LinkedList;
import java.util.Queue;
class PositionWrapper{
	Position pos;
	int dist;
	public Position getPos() {
		return pos;
	}
	public void setPos(Position pos) {
		this.pos = pos;
	}
	public int getDist() {
		return dist;
	}
	public void setDist(int dist) {
		this.dist = dist;
	}
	public PositionWrapper(Position pos, int dist) {
		super();
		this.pos = pos;
		this.dist = dist;
	}
	
	
	
}
class Position {
	int x;
	int y;

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public Position(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public Position() {
		super();
	}

}

public class KnightInChessBoard {

	public static void main(String[] args) {
		int N = 30;
		int knightPos[] = { 1, 1 };
		int targetPos[] = { 30, 30 };
		System.out.println(minStepToReachTarget(knightPos, targetPos, N));
	}

	private static int minStepToReachTarget(int[] knightPos, int[] targetPos, int n) {

		boolean[][] visited = new boolean[n][n];

		Queue<PositionWrapper> queue = new LinkedList<>();
		Position p  =new Position(knightPos[0],knightPos[1]); 
		int dis = 0;
		PositionWrapper wrapper = new PositionWrapper(p, dis);
		queue.add(wrapper);
		
		visited[knightPos[0]][knightPos[1]] = true;
		while(!queue.isEmpty()) {
			
			wrapper = queue.poll();
			p = wrapper.getPos();
			 dis= wrapper.getDist();
			// System.out.println("x "+p.x+" ,y: "+p.y);
			 if(p.x == targetPos[0]-1 && p.y == targetPos[1]-1)
			 {
				 return dis;
			 }			 
			 
			 if(isValid(p.x-2,p.y-1,n) && !visited[p.x-2][p.y-1]) {
				 visited[p.x-2][p.y-1] = true;
				 queue.add(new PositionWrapper(new Position(p.x-2,p.y-1),dis+1));
			 }
			 
			 if(isValid(p.x-1,p.y+2,n) && !visited[p.x-1][p.y+2]) {
				 visited[p.x-1][p.y+2] = true;
				 queue.add(new PositionWrapper(new Position(p.x-1,p.y+2),dis+1));
			 }
			 
			 if(isValid(p.x+1,p.y-2,n) && !visited[p.x+1][p.y-2]) {
				 visited[p.x+1][p.y-2] = true;
				 queue.add(new PositionWrapper(new Position(p.x+1,p.y-2),dis+1));
			 }
			 
			 
			 
			 if(isValid(p.x-2,p.y+1,n) && !visited[p.x-2][p.y+1]) {
				 visited[p.x-2][p.y+1] = true;
				 queue.add(new PositionWrapper(new Position(p.x-2,p.y+1),dis+1));
			 }
			 
			if(isValid(p.x+2,p.y+1,n) && !visited[p.x+2][p.y+1]) {
				 visited[p.x+2][p.y+1] = true;
				 queue.add(new PositionWrapper(new Position(p.x+2,p.y+1),dis+1));
			 }	
			
			 if(isValid(p.x+2,p.y-1,n) && !visited[p.x+2][p.y-1]) {
				 visited[p.x+2][p.y-1] = true;
				 queue.add(new PositionWrapper(new Position(p.x+2,p.y-1),dis+1));
			 }
			 
			 
			 
			 if(isValid(p.x+1,p.y+2,n) && !visited[p.x+1][p.y+2]) {
				 visited[p.x+1][p.y+2] = true;
				 queue.add(new PositionWrapper(new Position(p.x+1,p.y+2),dis+1));
			 }
			
			 if(isValid(p.x-1,p.y-2,n) && !visited[p.x-1][p.y-2]) {
				 visited[p.x-1][p.y-2] = true;
				 queue.add(new PositionWrapper(new Position(p.x-1,p.y-2),dis+1));
			 }
		}
		return dis;
	}

	private static boolean isValid(int i, int y, int n) {
		return i>=0 && y>=0 && i < n && y < n;
	}
}
