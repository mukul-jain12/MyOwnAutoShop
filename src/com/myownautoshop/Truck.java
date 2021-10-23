package com.myownautoshop;

//Sub-Class of Truck
public class Truck extends Car {
	private int weight;
	
	//constructor
	public Truck(int speed, double regularPrice, String color, int weight) {
		super(speed, regularPrice, color);
		this.weight = weight;
	}

	//calculating Sales price
	public double getSalePrice() {
		//calculating discount
		double discount = 0.80;
		if(weight > 2000) {
			discount = 0.90;
		}
		
		//return sales price
		return super.getSalePrice() * discount;
	}
}
