package collectionframework;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDemo {
	public static void main(String[] args) {
		Set set = new HashSet();
		set.add(1);
		set.add("name");
		set.add('r');
		set.add(false);
		set.add(465.6);
		set.add(1);
		System.out.println(set);
		System.out.println("size of set : "+set.size());
		Iterator itr = set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
