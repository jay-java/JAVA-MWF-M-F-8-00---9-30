package collectionframework;

import java.util.Enumeration;
import java.util.Vector;

public class VectoreDmeo {
	public static void main(String[] args) {
		Vector vr = new Vector();
		vr.add(1);
		vr.add('w');
		vr.add("name");
		vr.add(23.4);
		vr.add(false);
		vr.add(10);
		System.out.println(vr);
		System.out.println("size of vector is : "+vr.size());
		Enumeration em = vr.elements();
		while(em.hasMoreElements()) {
			System.out.println(em.nextElement());
		}
	}
}
