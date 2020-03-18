package datastructure;

import java.util.LinkedList;
import java.util.Queue;

class QueueNode {

	int p;
	int dist;

	public int getP() {
		return p;
	}

	public void setP(int p) {
		this.p = p;
	}

	public int getDist() {
		return dist;
	}

	public void setDist(int dist) {
		this.dist = dist;
	}

	public QueueNode(int p, int dist) {
		this.p = p;
		this.dist = dist;
	}

	public QueueNode() {
	}

}

public class SnakesLadder {

	private static int getMinDiceThrows(int[] moves, int n) {
		QueueNode q = new QueueNode(0, 0);

		Queue<QueueNode> queue = new LinkedList<>();

		queue.add(q);

		boolean visited[] = new boolean[n];
		visited[q.p] = true;
		while (!queue.isEmpty()) {
			
			q = queue.poll();

			if (q.p == n - 1) {
				break;
			}
			for (int i = q.p + 1; i < q.p + 6 && i < n; i++) {

				if (!visited[i]) {

					visited[i] = true;

					QueueNode a = new QueueNode();
					a.dist = q.dist + 1;

					if (moves[i] != -1) {
						a.p = moves[i];
					} else {
						a.p = -1;
					}

					queue.add(a);

				}
			}
		}

		return q.dist;
	}

	public static void main(String[] args) {

		int N = 30;
		int moves[] = new int[N];
		for (int i = 0; i < N; i++)
			moves[i] = -1;

		// Ladders
		moves[2] = 21;
		moves[4] = 7;
		moves[10] = 25;
		moves[19] = 28;

		// Snakes
		moves[26] = 0;
		moves[20] = 8;
		moves[16] = 3;
		moves[18] = 6;

		System.out.println("Min Dice throws required is " + getMinDiceThrows(moves, N));

	}

}
