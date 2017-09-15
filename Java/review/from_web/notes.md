## Difference between ArrayList and LinkedList

```Java


import java.util.*;


class MainProgram {
	
	
	public static main(String args[]) {


		//create arrayList of type String and add element to it

		List<String> array_list = new ArrayList<String>();
		array_list.add("New York");
		array_list.add("Montana");
		array_list.add("California");
		array_list.add("Washington");
		array_list.add("Chipotle");

		// create LinkedList of type String and add element to it


		List<String>link_list = new LinkedList<String>();
		link_list.add("Flori-duh!");
		link_list.add("Texas");
		link_list.add("Kansas");

		System.out.println("array List element:" + array_list);
		System.out.println("LinkedList element:" + link_list);

	}


} 

```


<p>ArrayList and LinkedList are two collection classes in Java and both implements List interface and maintains insertion order. Both are non-synchronized classes.</p>
<h4>Here are the some differences between ArrayList and LinkedList classes.</h4>

<table class="tabletalt">
  <tr>
    <th>ArrayList</th>
    <th>LinkedList</th>
  </tr>
  <tr>
    <td>ArrayList is the resizable array implementation of list interface.</td>
    <td>LinkedList is the Doubly-linked list implementation of the list interface.</td>
  </tr>
  <tr>
  	<td>Search operation in ArrayList is fast compared to the LinkedList. Because ArrayList maintains index based system for its elements as it uses array data structure implicitly that is why this makes it faster for searching an element in the list.</td>
    <td>Search operation in LinkedList is slow compared to the ArrayList because it implements doubly linked list which requires the traversal through all the elements for searching an element.</td> 
  </tr>
  <tr>
    <td>Element deletion in ArrayList is slow compared to LinkedList because ArrayList internally uses array so if any element is removed from the array then all the bits are shifted in memory.</td>
    <td>Element deletion in LinkedList is faster compared to ArrayList because LinkedList uses doubly linked list so no bit shifting is required in memory.</td>
  </tr>
  <tr>
    <td>ArrayList is better then LinkedList if the requirements are less add and remove operations and more search operations because it gives O(n) performance.</td>
    <td>LinkedList is better than ArrayList if the requirements are frequently add and delete operations but less search operation in the application because it gives O(1) performance.</td>
  </tr>
  <tr>
    <td>ArrayList cannot be iterated in reverse direction so we need to write code for the reverse order.</td>
    <td>LinkedList can be iterated in reverse direction using descendingIterator() method.</td>
  </tr>

</table>

