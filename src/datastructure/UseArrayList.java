package datastructure;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

	

		public class UseArrayList {

			public static void main(String[] args) throws Exception {
				/*
				 * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
				 * Use For Each loop and while loop with Iterator to retrieve data.
				 * Store all the sorted data into one of the databases.
				 *
				 */
				List<String> name = new ArrayList<>();

				name.add("Smith");
				name.add("John");
				name.add("Pamela");
				name.add("Patricia");
				name.add("Nehal");
				name.add("Ratan");

				System.out.println("Data retrieve from ArrayList: " + name);
				System.out.println("Peek element: " + name.get(2));
				System.out.println("Remove element at index 3: " + name.remove(3));
				System.out.println("On completion of the above functions, retrieve data from ArrayList: " + name);

				System.out.print("By using for Loop: ");
				for (String st : name) {
					System.out.print(" "+st);
				}
				System.out.println();

				System.out.print("By using while Loop with Iterator: ");
				Iterator it = name.iterator();
				while (it.hasNext()) {
					String s = (String) it.next();
					System.out.print(" "+s);
				}
				System.out.println();

				Collections.sort(name);
				System.out.println("ArrayList after sorting: "+name);
			}

		}



