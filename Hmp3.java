import java.util.HashMap;

public class Hmp3 {

	public static void main(String[] args) {
		 HashMap<Integer,String> map = new HashMap<Integer,String>();
			
			map.put(1,"Red");
			map.put(2,"Green");
			map.put(3,"Blue");
			map.put(4,"Orange");
			
			System.out.println("Values in first hashmap:"+map);
			
		 HashMap<Integer,String> map1 = new HashMap<Integer,String>();
			map1.put(5,"Purple");
			map1.put(6,"Black");
			map1.put(7,"Sky");
			map1.put(8,"White");
			
			System.out.println("Values in second hashmap:"+map1);
			
			map.putAll(map1);
			
			System.out.println("Now Values in second map:"+map);
			

	}

}
