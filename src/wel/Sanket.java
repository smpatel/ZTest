package wel;

import java.util.ArrayList;
import java.util.Collections;
import java.util.NavigableSet;
import java.util.TreeMap;
import java.util.TreeSet;

public class Sanket implements Comparable{
	NavigableSet<Integer> treeadd = new TreeSet<Integer>();
	public static void main(String[] args) {
		ArrayList al = new ArrayList<>();
		al.add(9);
		al.add(5);
		al.add(2);
		al.add(8);
		al.add(1);
		al.add(10);
		//Collections.sort(al);
		//Collections.reverse(al);
		TreeSet ts = new TreeSet<>(al);
		TreeMap tm = new TreeMap();
		
		System.out.println(""+ts.descendingSet());
		//Collections.
	}
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}
			
		
		
}
