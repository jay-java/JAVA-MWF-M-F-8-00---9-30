package collectionframework;

import java.util.HashSet;
import java.util.Iterator;

public class WithGenerics {
	public static void main(String[] args) {
		HashSet<String> set = new HashSet();
		set.add("name");
		set.add("pranav");
		set.add("ridhish");
		set.add("jay");
		System.out.println(set);
		Iterator itr= set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
