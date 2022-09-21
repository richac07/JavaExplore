package packageFront;

import java.util.HashMap;
import java.util.Map;

import packageFront.PairGreedyJobSequence.Pair;

public class PairTesting {
	
	
	  static class Pair {
		  
		    String finish;
		    String start;
		 
		    Pair(String first, String second)
		    {
		      this.finish = first;
		      this.start = second;
		    }
		  }
		 
		  
		  static void temp(String s1, String s2, String city) {
			  //Pair p1= new Pair(s1,s2);
			  Map<String, String> ips= new HashMap<>();
			  ips.put(s1, s2);
			  Map<Map<String, String>,String> mp= new HashMap<>();
			  mp.put(ips, city);
			  mp.forEach((k,v)-> System.out.println(k+"="+v));
			  System.out.println(ips.keySet());
			  System.out.println("woRKING" + mp.get(ips.get("10.126.9.111")));
			  //System.out.println("woRKING" + mp.get(getKey.get("10.126.9.111")));
			  
			  //pair
			  Pair p1= new Pair(s1,s2);
			  Map<Pair, String> c= new HashMap<>();		  
			  c.put(p1, city);
			  Map<String, Pair> c1= new HashMap<>();
			  c1.put(city, p1);
			  System.out.println("PAIR ValUE");
			  c.forEach((k,v)-> System.out.println(k+"="+v));
			  System.out.println(p1.finish);
			  System.out.println("TESTING" +mp.get(p1.start));
			  System.out.println("C1" +mp.get(city));
			  
		  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sip="10.126.9.10";
		String eip="10.126.9.111";
		String city="newyork";
		temp(sip,eip,city);
	}

}
