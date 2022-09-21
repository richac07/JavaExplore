package packageFront;


import java.util.ArrayList;


public class Graphs1 {
	
	public static void addEdge(ArrayList<ArrayList<Integer>> adj, int a, int b) {
		adj.get(a).add(b);
		adj.get(b).add(a);
	}

	
	public static void main(String[] args) {
		int v=5;
		ArrayList<ArrayList<Integer>> adj = new ArrayList<>(v);
		for(int i = 0; i<v; i++) {
			adj.add(new ArrayList<Integer>());
		}
		
		
		addEdge(adj, 0, 1);
       addEdge(adj, 0, 4);
        addEdge(adj, 1, 2);
        addEdge(adj, 1, 3);
        addEdge(adj, 1, 4);
        addEdge(adj, 2, 3);
        addEdge(adj, 3, 4);
		

		
		adj.stream().forEach(System.out::println);
		
	
		

	}

}
