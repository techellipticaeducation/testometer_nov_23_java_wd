package collectiondemo;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapDemo {
	public static void main(String[] args) {
		// Dictionary  , word -> value
		// Key  ->   Value

		Map<String,String> mp1 = new HashMap<String,String>();
		mp1.put("zboy", "boyvalue");
		mp1.put("boy", "boyvalue");
		mp1.put("cat", "catvalue");
		mp1.put("dog", "catvalue1");
		mp1.put("cat", "catvalue1");
		System.out.println(mp1);

		System.out.println(mp1.get("boy"));
		
		Set<String> allKeys = mp1.keySet();
		for(String s: allKeys) {
			System.out.println(s + " - " + mp1.get(s));
		}
		
		
	}
}
