package collectionframework;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
public interface MapDemo {
	public static void main(String[] args) {
		Map map = new HashMap();
		map.put(1, "riddhish");//entry
		map.put("pranav", 2);
		map.put(3, "jay");
		map.put(null, "java");
//		map.put(null, "c++");
		map.put(2, "jay");
		System.out.println(map);
		Set set = map.entrySet();
		Iterator itr = set.iterator();
		while(itr.hasNext()) {
			Map.Entry entry = (Entry)itr.next();
			System.out.println("key : "+entry.getKey()+" value : "+entry.getValue());
		}
	}
}
