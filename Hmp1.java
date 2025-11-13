import java.util.*;

public class Hmp1 {

	public static void main(String[] args) {
		HashMap<Integer,String> map = new HashMap<Integer,String>();
		
		map.put(1,"Red");
		map.put(2,"Green");
		map.put(3,"Blue");
		map.put(4,"Orange");
		
		System.out.println(map);
		
		for(Map.Entry v : map.entrySet()){
			System.out.println(v.getKey()+" "+v.getValue());
			
		}

	}

}
