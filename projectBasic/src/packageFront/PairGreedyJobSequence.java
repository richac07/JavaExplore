package packageFront;
import java.lang.*;
import java.util.*;
import java.io.*;
 
// checkin to the git
class PairGreedyJobSequence {
 
  // Pair class
  static class Pair {
 
    int finish;
    int start;
 
    Pair(int first, int second)
    {
      this.finish = first;
      this.start = second;
    }
  }
 
  static void SelectActivities(int s[], int f[])
  {
 
    // ArrayList to store results.
    ArrayList<Pair> ans = new ArrayList<>();
 
    // Minimum Priority Queue to sort activities in ascending order of finishing time (f[i]).
    PriorityQueue<Pair> p = new PriorityQueue<>((p1, p2) -> p1.finish - p2.finish);
 
    for (int i = 0; i < s.length; i++) {
      // Pushing elements in priority queue where the key is f[i]
      p.add(new Pair(f[i], s[i]));
    }
 
    Pair it = p.poll();
    int start = it.start;
    int finish = it.finish;
    //ans.add(new Pair(start, end));
    ans.add(it);
 
    while (!p.isEmpty()) {
      Pair itr = p.poll();
      if (itr.start >= finish) {
        finish = itr.finish;
        ans.add(itr);
      }
    }
    System.out.println(
      "Following Activities should be selected. \n");
 
    for (Pair itr : ans) {
      System.out.println(
        "Activity started at: " + itr.start
        + " and ends at  " + itr.finish);
    }
  }
 
  // Driver Code
  public static void main(String[] args)
  {
 
    int s[] = { 1, 3, 0, 5, 8, 5 };
    int f[] = { 2, 4, 6, 7, 9, 9 };
 
    // Function call
    SelectActivities(s, f);
  }
}