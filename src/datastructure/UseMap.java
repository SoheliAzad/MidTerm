package datastructure;


		import java.util.*;
		public class UseMap {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Map that includes storing and retrieving elements.
		 * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 */

		List<String> cityOfBangladesh = new ArrayList<String>();
		cityOfBangladesh.add("Dhaka");
		cityOfBangladesh.add("Khulna");


		List<String> cityOfIndia = new ArrayList<String>();
		cityOfIndia.add("Kolkata");
		cityOfIndia.add("Delhi");


		List<String> cityOfPakistan = new ArrayList<String>();
		cityOfPakistan.add("Karachi");
		cityOfPakistan.add("Islamabad");

		Map<String,List<String>> map=new HashMap<String, List<String>>();
		map.put("Bangladesh", cityOfBangladesh);
		map.put("India", cityOfIndia);
		map.put("Pakistan", cityOfPakistan);

		Iterator it=map.entrySet().iterator();
		System.out.println("Using while loop: ");
		while(it.hasNext()){
			System.out.println(it.next());
		}
		System.out.println("\nUsing for each loop: ");
		for(Map.Entry entry:map.entrySet()){
			System.out.println(entry.getKey()+""+entry.getValue());
		}
	}
}

