import java.util.HashMap;

public class Hmp10 {

	public static void main(String[] args) {
		 HashMap<Integer,String> map = new HashMap<Integer,String>();
			
			map.put(1,"Red");
			map.put(2,"Green");
			map.put(3,"Blue");
			map.put(4,"Orange");
			
			System.out.println(map);
			System.out.println("Value for keys 3 is "+map.get(3));
	}

}
