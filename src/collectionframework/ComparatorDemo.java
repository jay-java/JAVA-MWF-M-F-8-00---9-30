package collectionframework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorDemo{
	public static void main(String[] args) {
		Student s1 = new Student(2, "ridhish", 67.7f);
		Student s2 = new Student(5, "pranav", 71.3f);
		Student s3 = new Student(3, "jay", 45.5f);
		List<Student> list = new ArrayList<Student>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		System.out.println(list);
		Comparator<Student> com = new Comparator<Student>() {
			
			@Override
			public int compare(Student o1, Student o2) {
				if(o1.id>o2.id) {
					return 1;
				}
				else {
					return -1;
				}
			}
		};
		Collections.sort(list, com);
		for(Student s:list) {
			System.out.println(s);
		}
	}

}
