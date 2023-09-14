package com;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class MainApp {
	public static void main(String[] args) {
		
		 List<Fruit> fruits = Arrays.asList(
	                new Fruit("Apple", "Yellow", "India", 150, 10),
	                new Fruit("Apple", "Green", "India", 120, 5),
	                new Fruit("Apple", "Red", "UK", 80, 20),
	                new Fruit("Apple", "Red", "USA", 60, 150),
	                new Fruit("Apple", "White", "UK", 40, 12),
	                new Fruit("Mango", "Yellow", "USA", 500, 10),
	                new Fruit("Mango", "Green", "India", 100, 70),
	                new Fruit("Mango", "Red", "USA", 150, 200),
	                new Fruit("Orange", "Orange", "UK", 20, 50)
	        );
		 
		 
		 //	 list all fruits whose type is 'India'
		 List<Fruit> fruitsFromIndia = fruits.stream()
		 .filter(f->"India".equalsIgnoreCase(f.getType()))
		 .collect(Collectors.toList());
		 
		 //fruitsFromIndia.forEach(System.out::println);
		 
		
		// find all fruits whose color is 'red' 
		List<Fruit> redFruits= fruits.stream()
		.filter(f->"Red".equalsIgnoreCase(f.getColor()))
		.collect(Collectors.toList());
		//redFruits.forEach(System.out::println);
		
		
		// issue with code..
		//Partition fruits based on their color red
		//Map<Boolean, List<Fruit>> partitionByColor = fruits.stream()
		//.collect(Collectors.partitioningBy(f->"Apple".equalsIgnoreCase(f.getName())&& "Red".equalsIgnoreCase(f.getColor())));
		//System.out.println(partitionByColor);
		
		
		// list of only red apples using grouppingBy
		Map<String, List<Fruit>> collect = fruits.stream()
		.filter(f->"Red".equalsIgnoreCase(f.getColor())&& "Apple".equalsIgnoreCase(f.getName()))
		.collect(Collectors.groupingBy((Fruit::getColor)));
		//System.out.println(collect);
		
		
		 // list all Red Apples
		 List<Fruit> redApples= fruits.stream()
		 .filter(f->"Apple".equalsIgnoreCase(f.getName())&& "Red".equalsIgnoreCase(f.getColor()))
		 .collect(Collectors.toList());
		 //redApples.forEach(System.out::println);
		 
		 //list all Apples
		 
		 List<Fruit> apples = fruits.stream()
		 .filter(f->"Apple".equalsIgnoreCase(f.getName()))
		 .collect(Collectors.toList());
		// apples.forEach(System.out::println);
		 
		 //find a fruit type whose cost is higher(greater) than all other fruits
		 Optional<Fruit> mostExpensiveFruit = fruits.stream()
		 .max(Comparator.comparingDouble(Fruit::getPrice));
		 //mostExpensiveFruit.ifPresent(System.out::println);
		 
		 //find total price of apples
		 
		 double totalPriceOfApples = fruits.stream()
		 .filter(f->"Apple".equalsIgnoreCase(f.getName()))
		 .mapToDouble(f->f.getPrice()*f.getQty())
		 .sum();
		// System.out.println(totalPriceOfApples);
		 
	  //find total price of apples whose color is red
		 
	   double totalPriceOfRedApples = fruits.stream()
	   .filter(f->"Apple".equalsIgnoreCase(f.getName())&&"Red".equalsIgnoreCase(f.getColor()))
	   .mapToDouble(f->f.getPrice()*f.getQty())
	   .sum();
	   //System.out.println(totalPriceOfRedApples);
	   
	   //find total price of Mango who  are from USA
	   double totalPriceOfMongoesFromUSA = fruits.stream()
	   .filter(f->"Mango".equalsIgnoreCase(f.getName())&& "USA".equalsIgnoreCase(f.getType()))
	   .mapToDouble(f->f.getPrice()*f.getQty())
	   .sum();
	   //System.out.println(totalPriceOfMongoesFromUSA);
	   
	   //find price of all fruit total
	   
	   double totalPriceOfAllFruits = fruits.stream()
	   .mapToDouble(f->f.getPrice()*f.getQty())
	   .sum();
	   //System.out.println(totalPriceOfAllFruits);
	   
	   //find total of apple fruits
	   long numberOfApples = fruits.stream()
	   .filter(f->"Apple".equalsIgnoreCase(f.getName()))
	   .count();
	   System.out.println(numberOfApples);
	   
	   


	   
	   
	   
	   
	   

		 
		 
		 
		 
		 
		 
		
		 
		 
		 
		 
		 
		 
		
			

		 
		 

		 
		 
		 
		 
		 
		 
		
		
	}

}
