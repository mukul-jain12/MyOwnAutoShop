package com.myownautoshop;

public class MyOwnAutoShop {
	//main method
	public static void main(String args[]) {
		System.out.println("Welcome to My Auto Shop \n");
		
		//Sedan object or instance(sub class of Car class)
		Sedan sedan = new Sedan(220, 6000.00, "Silver", 15);
		
		//There are Two Ford object or instance(sub class of Car class)
		Ford fordInstanceOne = new Ford(240, 7200.00, "White", 2015, 9);
		Ford fordInstanceTwo = new Ford(280, 8500.00, "Grey", 2016, 20);
		
		//Car object or instance(Car class)
		Car car = new Car(150, 5000.00, "white");
		
		//printing the sales value of different cars
		System.out.println("Saden sales price is : " + sedan.getSalePrice() + "\n");
		System.out.println("Ford car (1st) sales price is : " + fordInstanceOne.getSalePrice() + "\n");
		System.out.println("Ford car (2nd) sales price is : " + fordInstanceTwo.getSalePrice() + "\n");
		System.out.println("Car sales price is :  " + car.getSalePrice() + "\n");
	}
}
