package collectionframework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Stu implements Comparable<Stu>{
	int id;
	String name;
	public Stu(int id, String name) {
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "id : "+id+" name : "+name;
	}
	@Override
	public int compareTo(Stu o) {
		if(o.id>this.id) {
			return 1;
		}
		else {
			return -1;
		}
	}
}
public class ComparableDemo {
	public static void main(String[] args) {
		Stu s1 = new Stu(2, "riddhish");
		Stu s2 = new Stu(1, "pranav");
		List<Stu> list = new ArrayList<Stu>();
		list.add(s1);
		list.add(s2);
		Collections.sort(list);
		for(Stu s:list) {
			System.out.println(s);
		}
	}
}
