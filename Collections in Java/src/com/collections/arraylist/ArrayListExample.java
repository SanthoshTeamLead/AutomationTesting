package com.collections.arraylist;

import java.util.ArrayList;

public class ArrayListExample {
		public static void main(String[] args){
			ArrayList<Integer> array = new ArrayList<>();
			array.add(21);
			array.add(25);
			array.add(56);
			array.add(85);
			System.out.println(array);
			
			ArrayList<String> Fruits = new ArrayList<>();
			Fruits.add("Banana");
			Fruits.add("Apple");
			Fruits.add("Mango");
			Fruits.add("Tamarind");
			Fruits.add("Tamarind");
			
			System.out.println(Fruits);
			
			ArrayList<String> Vegitables = new ArrayList<>();
			Vegitables.add("tomato");
			Vegitables.add("Bendi");
			Vegitables.add("Bottle Gourd");
			Vegitables.add("Mirchi");
			
			System.out.println(Vegitables);
			
			Fruits.addAll(Vegitables);
			
			System.out.println(Fruits);
			System.out.println(Fruits.size());
			Fruits.remove(7);
			
			System.out.println(Fruits);
			Fruits.set(1, "raju");
			Fruits.add(null);
			Vegitables.add("Mirchi");
			System.out.println(Fruits);
			

		}
}
