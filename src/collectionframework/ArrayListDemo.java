package collectionframework;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(1);
		list.add('q');
		list.add("name");
		list.add(23.4);
		list.add(false);
		list.add(1);
		list.add(45);
		list.add(34.5);
//		list.remove(4);
		System.out.println(list);
		System.out.println("size of list : "+list.size());
		Iterator itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
