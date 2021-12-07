package com.collections.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		
		List<String> fastFoodNames = new ArrayList<String>();
		
		//adding elements in list at end of the list
		fastFoodNames.add("Burger");
		fastFoodNames.add("French Fries");
		System.out.println(fastFoodNames);
		
		//adding elements in list at particular index, all the other element will shift one forward,complexity O(n)
		fastFoodNames.add(1, "Pizza");
		System.out.println(fastFoodNames);
	
		//addall - you can add all elements of one list into another at end of the list
		List<String> anotherList = new ArrayList<String>();
		anotherList.add("Manchurians");
		anotherList.add("Noodles");
		
		fastFoodNames.addAll(anotherList);
		
		System.out.println(fastFoodNames);
		
		//get element from list by index
		System.out.println("Element at Index 1 = "+fastFoodNames.get(1));
		
		
		//get size of arraylist
		System.out.println("Size of List = "+fastFoodNames.size());
		
		//update element in list
		fastFoodNames.set(1, "Pasta");
		System.out.println(fastFoodNames);
		
		
		//to check if element is present in list
		System.out.println("if Burger Contains in List :: "+fastFoodNames.contains("Burger"));
		
		//removing element complexity O(n)
		//remove element from list by index
		fastFoodNames.remove(1);
		System.out.println(fastFoodNames);
		
		
		//remove elements from list by value
		fastFoodNames.remove("Burger");
		System.out.println(fastFoodNames);
		
		
		
		//using iterator
		
		Iterator<String> it = fastFoodNames.iterator();
		
		while(it.hasNext()) {
			String value=it.next(); //get next element
			System.out.println(value);
			
		}
		
		//remove all elements from list
		fastFoodNames.clear();
		System.out.println("List = "+fastFoodNames);
		
		
	}
	

	
}
