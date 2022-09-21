package packageFront;
import java.lang.*;
import java.util.*;
import java.io.*;
 
class PairUsedGreedyActivitySelection {
 
  // Pair class
  static class Pair {
 
    int deadline;
    int profit;
 
    Pair(int d, int p)
    {
      this.deadline = d;
      this.profit = p;
    }
  }
 
  static void selectJobSeq(int dl[], int pf[])
  {
 
    // ArrayList to store results.
    ArrayList<Pair> ans = new ArrayList<>();
 
    // Minimum Priority Queue to sort activities in ascending order of finishing time (f[i]).
    PriorityQueue<Pair> pq = new PriorityQueue<>((p1, p2) -> p2.profit - p1.profit);
 
    for (int i = 0; i < dl.length; i++) {
      // Pushing elements in priority queue where the key is f[i]
      pq.add(new Pair(dl[i], pf[i]));
    }
 
    int d=0;
    int pro= 0;
    Pair it = pq.poll();
    pro=pro+it.profit;
    
    d++;
 
    while (!pq.isEmpty()) {
      Pair itr = pq.poll();
      if (itr.deadline > d) {
    	  pro=pro+itr.profit;
    	  d++;
      }
    }
    System.out.println(
      "Following is the Job sequence. \n");
 
    
      System.out.println(
        " total profit " + pro
        + " and deadlin at  " + d);
    
  }
 
  // Driver Code
  public static void main(String[] args)
  {
 
    int dl[] = { 1, 2, 1, 2, 1};
    int pf[] = { 19, 100, 15, 27, 25};
 
    // Function call
    selectJobSeq(dl, pf);
  }
}