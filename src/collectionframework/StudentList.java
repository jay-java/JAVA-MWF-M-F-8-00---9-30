package collectionframework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Student{
	int id;
	String name;
	float per;
	Student(int id, String name, float per){
		this.id = id;
		this.name = name;
		this.per = per;
	}
	public String toString() {
		return "id = "+id+" name = "+name+" per = "+per;
	}
}
public class StudentList {
	public static void main(String[] args) {
		Student s1 = new Student(1, "ridhish", 67.7f);
		Student s2 = new Student(2, "pranav", 71.3f);
		Student s3 = new Student(3, "jay", 45.5f);
		List<Student> list = new ArrayList<Student>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		System.out.println(list);
		for(Student s:list) {
			System.out.println(s);
		}
//		
//		Iterator itr= list.iterator();
//		while(itr.hasNext()) {
//			System.out.println(itr.next());
//		}
	}
}
