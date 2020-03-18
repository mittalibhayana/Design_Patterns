package datastructure;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryMaze {

	private static int bfs(int[][] mat, int row, int col, Point src, Point dest) {

		if (mat[src.getX()][src.getY()] != 1 && mat[dest.getX()][dest.getY()] != 1) {
			return -1;
		}

		boolean[][] visited = new boolean[row][col];

		Queue<QNode> queue = new LinkedList<>();
		queue.add(new QNode(src, 0));
		int dis = 0;
		visited[src.getX()][src.getY()] = true;

		while (!queue.isEmpty()) {

			QNode q = queue.poll();
			src = q.getP();
			dis = q.getDis();
			System.out.println("coordinates: x,y:(" + src.getX() + ", " + src.getY() + ")");

			if (dest.equals(src)) {
				return q.dis;
			}

			int i = src.getX();
			int j = src.getY();

			if (isValid(i - 1, j, row, col) && mat[i - 1][j] == 1 && !visited[i - 1][j]) {
				visited[i - 1][j] = true;
				queue.add(new QNode(new Point(i - 1, j), dis + 1));
			}
			if (isValid(i, j - 1, row, col) && mat[i][j - 1] == 1 && !visited[i][j - 1]) {
				visited[i][j - 1] = true;
				queue.add(new QNode(new Point(i, j - 1), dis + 1));
			}

			if (isValid(i, j + 1, row, col) && mat[i][j + 1] == 1 && !visited[i][j + 1]) {
				visited[i][j + 1] = true;
				queue.add(new QNode(new Point(i, j + 1), dis + 1));
			}

			if (isValid(i + 1, j, row, col) && mat[i + 1][j] == 1 && !visited[i + 1][j]) {
				visited[i + 1][j] = true;
				queue.add(new QNode(new Point(i + 1, j),dis+1));
			}

		}
		return -1;
	}

	private static boolean isValid(int i, int j, int row, int col) {
		return i < row && j < col && i >= 0 && j >= 0;
	}

	public static void main(String[] args) {
		int mat[][] = { { 1, 0, 1, 1, 1, 1, 0, 1, 1, 1 }, { 1, 0, 1, 0, 1, 1, 1, 0, 1, 1 },
				{ 1, 1, 1, 0, 1, 1, 0, 1, 0, 1 }, { 0, 0, 0, 0, 1, 0, 0, 0, 0, 1 }, { 1, 1, 1, 0, 1, 1, 1, 0, 1, 0 },
				{ 1, 0, 1, 1, 1, 1, 0, 1, 0, 0 }, { 1, 0, 0, 0, 0, 0, 0, 0, 0, 1 }, { 1, 0, 1, 1, 1, 1, 0, 1, 1, 1 },
				{ 1, 1, 0, 0, 0, 0, 1, 0, 0, 1 } };

		Point src = new Point(0, 0);
		int row = 9;
		int col = 10;
		Point dest = new Point(3, 4);

		System.out.println(bfs(mat, row, col, src, dest));
	}
}

class Point {
	private int x;
	private int y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + x;
		result = prime * result + y;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Point other = (Point) obj;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}

}

class QNode {
	Point p;
	int dis;

	public QNode(Point src, int i) {
		p = src;
		dis = i;
	}

	public Point getP() {
		return p;
	}

	public void setP(Point p) {
		this.p = p;
	}

	public int getDis() {
		return dis;
	}

	public void setDis(int dis) {
		this.dis = dis;
	}

}
