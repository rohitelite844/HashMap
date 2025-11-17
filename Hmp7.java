import java.util.HashMap;

public class Hmp7 {

	public static void main(String[] args) {
		 HashMap<String,Integer> map = new HashMap<String,Integer>();
			
			map.put("Red",1);
			map.put("Blue",3);
			map.put("Green",2);	
			map.put("Orange",4);
			
			System.out.println("The Original map : "+map);

			if(map.containsKey("Green"))
			{   
				System.out.println("Is green key exit?");
				System.out.println("yes!"+map.get("green"));
			}
			else 
			{   
				System.out.println("Is green key exit?");
				System.out.println("no");
			}
			if(map.containsKey("black"))
			{   
				System.out.print("Is black key exit?");
				System.out.println("yes!"+map.get("black"));
			}
			else 
			{   
				System.out.println("Is black key exit?");
				System.out.println("no!");
			}
			
	}

}
