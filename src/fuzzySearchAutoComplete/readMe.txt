Levenshtein Distance Algorithms -> calculate distance between two strings.

the
there -> 2

romeo
rome ->1




The compute(Key, BiFunction) method of HashMap class allows you to update a value in HashMap. The compute() method tries to compute a mapping for the specified key and its current mapped value (or null if there is no current mapping is found). This method is used to automatically update a value for given key in HashMap.

Example

Mapping to increment a int value of mapping:
map.compute(key, (k, v) -> (v == null) ? 1 : v+1)

// Java program to demonstrate
// compute(Key, BiFunction) method.

import java.util.*;

public class GFG {

	// Main method
	public static void main(String[] args)
	{

		// Create a Map and add some values
		Map<String, String> map = new HashMap<>();
		map.put("Name", "Aman");
		map.put("Address", "Kolkata");

		// Print the map
		System.out.println("Map: " + map);

		// remap the values using compute() method
		map.compute("Name", (key, val)
								-> val.concat(" Singh"));
		map.compute("Address", (key, val)
								-> val.concat(" West-Bengal"));

		// print new mapping
		System.out.println("New Map: " + map);
	}
}
Map: {Address=Kolkata, Name=Aman}
New Map: {Address=Kolkata West-Bengal, Name=Aman Singh}



//

1. there are numerous algorithms to find similar strings, Levenshtein distance, Daitch-Mokotoff Soundex, n-grams etc.
2. Java implementations - lucene. Apache Lucene(TM) is a high-performance, full-featured text search engine library written entirely in Java. It is a technology suitable for nearly any application that requires full-text search, especially cross-platform.


https://medium.com/nerd-for-tech/what-is-fuzzy-search-4e4227c3c5f5


