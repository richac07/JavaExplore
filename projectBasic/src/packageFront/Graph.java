package packageFront;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Graph {
	int v;
	LinkedList<Integer> adj[];

	Graph(int vertex){
		this.v=vertex;
		adj = new LinkedList[v];
		for(int i=0;i<v;i++) {
			adj[i] = new LinkedList();
		}
	}

	void addEdge(int a, int b) {
		adj[a].add(b);
	}

	void BFS(int s) {
		//none of the nodes are visited
		boolean[] visited = new boolean[v];
		Queue<Integer> qu = new LinkedList<>();

		visited[s]=true;
		qu.add(s);

		while(!qu.isEmpty()) {
			s= qu.poll();
			System.out.print(s+ " ");
			Iterator<Integer> i =adj[s].listIterator();
			while(i.hasNext()) {
				int n = i.next();
				if(!visited[n]) {
					visited[n] = true;
					qu.add(n);

				}
			}
		}



	}

	void DFS(int a) {
		boolean visited[] = new boolean[v];
		Stack<Integer> stk = new Stack<>();
		visited[a]= true;
		stk.add(a);
		while(!stk.isEmpty()) {
			a=stk.pop();
			System.out.print(a+ " ");
			Iterator<Integer> i = adj[a].listIterator();
			while(i.hasNext()) {
				int n = i.next();
				if(!visited[n]) {
					visited[n]= true;
					stk.add(n);
				}

			}
		}

	}



	public static void main(String[] args) {
		Graph g = new Graph(5);
		g.addEdge(0, 1);
		g.addEdge(0, 4);
		g.addEdge(1, 2);
		g.addEdge(1, 3);
		g.addEdge(1, 4);
		g.addEdge(2, 3);
		g.addEdge(3, 4);

		System.out.println("Breadth First Traversal");
		g.BFS(0);
		System.out.println('\n' + "Depth First Traversal");
		g.DFS(0);


	}

}
